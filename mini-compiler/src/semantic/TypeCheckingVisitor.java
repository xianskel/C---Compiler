package semantic;

import ast.*;
import visitor.*;
import types.*;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {
	
	@Override
	public Void visit(Assignment ass, Void param) {
		super.visit(ass, param);
		ass.setlValue(ass.getLeftHandSide().getlValue());
		if (!ass.getlValue()) 
			new ErrorType("Cannot assign value to " + ass.getLeftHandSide().toString(), ass);
		ass.getLeftHandSide().getType().assignment(ass.getRightHandSide().getType(), ass);
		return null;
	}

	@Override
	public Void visit(Arithmetic arith, Void param) {
		super.visit(arith, param);
		arith.setlValue(false);
		arith.setType(arith.getOperand1().getType().arithmetic(arith.getOperand2().getType(), arith));
		return null;
	}

	@Override
	public Void visit(Variable variable, Void param) {
		variable.setlValue(true);
		variable.setType(variable.getDefinition().getType());
		return null;
	}

	@Override
	public Void visit(IntLiteral intLiteral, Void param) {
		intLiteral.setlValue(false);
		intLiteral.setType(IntType.getInstance());
		return null;
	}

	@Override
	public Void visit(RealLiteral realLiteral, Void param) {
		realLiteral.setlValue(false);
		realLiteral.setType(RealType.getInstance());
		return null;
	}

	@Override
	public Void visit(CharLiteral charLiteral, Void param) {
		charLiteral.setlValue(false);
		charLiteral.setType(CharType.getInstance());
		return null;
	}

	@Override
	public Void visit(Comparison comparison, Void param) {
		super.visit(comparison, param);
		comparison.setlValue(false);
		comparison.setType(comparison.getOperand1().getType().comparison(comparison.getOperand2().getType(), comparison));
		return null;
	}

	@Override
	public Void visit(DotNotation dot, Void param) {
		super.visit(dot, param);
		dot.setlValue(true);
		dot.setType(dot.getOperand1().getType().dot(dot.getOperand2().toString(), dot));
		return null;
	}

	@Override
	public Void visit(Cast cast, Void param) {
		cast.setlValue(cast.getCastType().getlValue());
		cast.setType(cast.getCastType());
		return null;
	}

	@Override
	public Void visit(Indexing indexing, Void param) {
		super.visit(indexing, param);
		indexing.setlValue(true);
		indexing.setType(indexing.getExpression().getType().squareBrackets(indexing.getExpression().getType(), indexing));
		if (!(indexing.getExpression2().getType() instanceof IntType)) 
			new ErrorType("Cannot index array with type " + indexing.getExpression2().getType(), indexing);
		return null;
	}

	@Override
	public Void visit(Logical logical, Void param) {
		super.visit(logical, param);
		logical.setlValue(false);
		logical.setType(logical.getOperand1().getType().logical(logical.getOperand2().getType(), logical));
		return null;
	}

	@Override
	public Void visit(RecordField record, Void param) {
		record.setlValue(false);
		return null;
	}

	@Override
	public Void visit(UnaryMinus unaryMinus, Void param) {
		super.visit(unaryMinus, param);
		unaryMinus.setlValue(false);
		unaryMinus.setType(unaryMinus.getOperand().getType());
		return null;
	}

	@Override
	public Void visit(UnaryNot unaryNot, Void param) {
		super.visit(unaryNot, param);
		unaryNot.setlValue(false);
		unaryNot.setType(unaryNot.getOperand().getType());
		return null;
	}

	public Void visit(TypeDefinition typeDef, Void param) {
		typeDef.setlValue(false);
		return null;
	}

	@Override
	public Void visit(Write write, Void param) {
		super.visit(write, param);
		write.setlValue(false);
		return null;
	}
	
	@Override
	public Void visit(Read read, Void param) {
		read.getExpression().accept(this, null);
		read.setlValue(false);
		if(!read.getExpression().getlValue())
			new ErrorType("Invalid read parameter" + read.getExpression(), read.getExpression());
		return null;
	}

	public Void visit(VarDefinition varDefinition, Void param) {
		varDefinition.setlValue(true);
		return null;
	}

	public Void visit(FuncDefinition funcDef, Void param) {
		for(VarDefinition varDefinition: funcDef.getVarDefinitions())
			varDefinition.accept(this, param);
		for(Statement statement: funcDef.getStatements()) {
			statement.accept(this, param);
			if(statement instanceof Return && 
					!((Return) statement).getExpression().getType().equals(funcDef.getType().getReturnType())) {
				new ErrorType("Invalid return type " + ((Return) statement).getExpression().getType(), funcDef);
			}
		}
		funcDef.setlValue(false);
		return null;
	}

	@Override
	public Void visit(FuncInvocation funcInv, Void param) {
		for(Expression exp: funcInv.getParams())
			exp.accept(this, param);
		funcInv.setlValue(false);
		funcInv.setType(funcInv.getDefinition().getType().parenthesis(funcInv.getParams(), funcInv));
		return null;
	}
	
	@Override
	public Void visit(While wStatement, Void param) {
		super.visit(wStatement, param);
		if(!(wStatement.getExpression().getType() instanceof IntType)) {
			new ErrorType(wStatement.getExpression() + " not an int", wStatement);
		}
		return null;
	}
	
	@Override
	public Void visit(IfElse ifElse, Void param) {
		super.visit(ifElse, param);
		System.err.println("ffa");
		if(!(ifElse.getExpression().getType() instanceof IntType)) {
			new ErrorType(ifElse.getExpression() + " not an int", ifElse);
		}
		return null;
	}
	
	

}