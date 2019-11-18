package semantic;

import ast.*;
import visitor.*;
import types.*;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {

	@Override
	public Void visit(Assignment assignment, Void param) {
		assignment.getLeftHandSide().accept(this, null);
		assignment.getRightHandSide().accept(this, null);
		assignment.setlValue(assignment.getLeftHandSide().getlValue());
		if (!assignment.getlValue()) 
			new ErrorType("The identifier " + assignment.getLeftHandSide().toString()
					+ " is not a valid left value", assignment);
		return null;
	}

	@Override
	public Void visit(Arithmetic arithmetic, Void param) {
		arithmetic.getOperand1().accept(this, null);
		arithmetic.getOperand2().accept(this, null);
		arithmetic.setlValue(false);
		return null;
	}

	@Override
	public Void visit(Variable variable, Void param) {
		variable.setlValue(true);
		return null;
	}

	@Override
	public Void visit(IntLiteral intLiteral, Void param) {
		intLiteral.setlValue(false);
		return null;
	}

	@Override
	public Void visit(RealLiteral realLiteral, Void param) {
		realLiteral.setlValue(false);
		return null;
	}

	@Override
	public Void visit(CharLiteral charLiteral, Void param) {
		charLiteral.setlValue(false);
		return null;
	}

	@Override
	public Void visit(Comparison comparison, Void param) {
		comparison.getOperand1().accept(this, null);
		comparison.getOperand2().accept(this, null);
		comparison.setlValue(false);
		return null;
	}

	@Override
	public Void visit(DotNotation dotNotation, Void param) {
		dotNotation.getOperand1().accept(this, null);
		dotNotation.getOperand2().accept(this, null);
		dotNotation.setlValue(true);
		return null;
	}

	@Override
	public Void visit(Cast cast, Void param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void visit(Indexing indexing, Void param) {
		indexing.getExpression().accept(this, null);
		indexing.getExpression2().accept(this, null);
		indexing.setlValue(true);
		return null;
	}

	@Override
	public Void visit(Logical logical, Void param) {
		logical.getOperand1().accept(this, null);
		logical.getOperand2().accept(this, null);
		logical.setlValue(false);
		return null;
	}

	@Override
	public Void visit(RecordField record, Void param) {
		record.setlValue(false);
		return null;
	}

	@Override
	public Void visit(UnaryMinus unaryMinus, Void param) {
		unaryMinus.getOperand().accept(this, null);
		unaryMinus.setlValue(false);
		return null;
	}

	@Override
	public Void visit(UnaryNot unaryNot, Void param) {
		unaryNot.getOperand().accept(this, null);
		unaryNot.setlValue(false);
		return null;
	}

	@Override
	public Void visit(TypeDefinition typeDef, Void param) {
		typeDef.setlValue(false);
		return null;
	}

	@Override
	public Void visit(Write write, Void param) {
		write.setlValue(false);
		return null;
	}

	@Override
	public Void visit(VarDefinition varDefinition, Void param) {
		varDefinition.setlValue(true);
		return null;
	}

	@Override
	public Void visit(FuncDefinition funcDefinition, Void param) {
		for(VarDefinition varDefinition: funcDefinition.getVarDefinitions())
			varDefinition.accept(this, param);
		for(Statement statement: funcDefinition.getStatements())
			statement.accept(this, param);
		funcDefinition.setlValue(false);
		return null;
	}

	@Override
	public Void visit(FuncInvocation funcInvocation, Void param) {
		funcInvocation.setlValue(false);
		return null;
	}
	
	

}