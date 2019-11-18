package visitor;

import types.*;
import ast.*;

public class AbstractVisitor<TP, TR> implements Visitor<TP, TR> {

	@Override
	public TR visit(Program program, TP param) {
		for(Definition definition: program.getDefinitions()) {
			definition.accept(this, param);
		}
		return null;
	}

	@Override
	public TR visit(Variable variable, TP param) {
		return null;
	}

	@Override
	public TR visit(IntLiteral intLiteral, TP param) {
		return null;
	}

	@Override
	public TR visit(RealLiteral realLiteral, TP param) {
		return null;
	}

	@Override
	public TR visit(Assignment assignment, TP param) {
		assignment.getLeftHandSide().accept(this, param);
		assignment.getRightHandSide().accept(this, param);
		return null;
	}


	@Override
	public TR visit(Write write, TP param) {
		write.getExpression().accept(this, param);
		return null;
	}

	@Override
	public TR visit(VarDefinition varDefinition, TP param) {
		varDefinition.getType().accept(this, param);
		return null;
	}
	
	@Override
	public TR visit(FuncDefinition funcDefinition, TP param) {
		funcDefinition.getType().accept(this, param);
		return null;
	}


	@Override
	public TR visit(IntType intType, TP param) {
		return null;
	}

	@Override
	public TR visit(ErrorType errorType, TP param) {
		return null;
	}

	@Override
	public TR visit(RealType realType, TP param) {
		return null;
	}

	@Override
	public TR visit(Arithmetic arithmetic, TP param) {
		arithmetic.getOperand1().accept(this, param);
		arithmetic.getOperand2().accept(this, param);
		return null;
	}

	@Override
	public TR visit(CharLiteral charLiteral, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(Comparison comparison, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(DotNotation dotNotation, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(Cast cast, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(Indexing indexing, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(Logical logical, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(RecordField record, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(UnaryMinus unaryMinus, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(UnaryNot unaryNot, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(TypeDefinition typeDef, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(FuncInvocation funcInvocation, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(IfElse ifElse, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(Read read, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(Return rStatement, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(While wStatement, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(ArrayType arrayType, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(CharType charType, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(CustomType type, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(FuncType type, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(StructType type, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TR visit(VoidType type, TP param) {
		// TODO Auto-generated method stub
		return null;
	}

}
