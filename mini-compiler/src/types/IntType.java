package types;

import ast.ASTNode;
import visitor.Visitor;

public class IntType extends AbstractType {

	private IntType() {
		super(0, 0);
	}

	private static IntType instance=new IntType();
	
	
	public static IntType getInstance() { return instance; }
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}
	
	@Override
	public Type arithmetic(Type type, ASTNode node) {
		if (type instanceof types.ErrorType)
			return type;
		if (type instanceof IntType)
			return this;
		return new ErrorType(String.format(
				"Arithmetic operations of integers do not allow a second operand of type %s",  type),
				node);
	}

	@Override
	public Type assignment(Type type, ASTNode node) {
		if (type instanceof types.ErrorType)
			return type;
		if (type instanceof IntType)
			return this;
		return new ErrorType(String.format(
				"%s cannot be assigned to integer",  type),
				node);
	}
	
	@Override
	public Type logical(Type type, ASTNode node) {
		if (type instanceof types.ErrorType)
			return type;
		if (type instanceof IntType)
			return this;
		return new ErrorType(String.format(
				"%s is not an int",  type),
				node);
	}
	
	@Override
	public Type comparison(Type type, ASTNode node) {
		if (type instanceof types.ErrorType)
			return type;
		if (type instanceof IntType)
			return this;
		return new ErrorType(String.format(
				"%s cannot be compared to int",  type),
				node);
	}
	
	public String toString() {
		return "Integer";
	}
	
	@Override
	public int numberOfBytes() {
		return 2;
	}
}
