package types;

import ast.ASTNode;
import visitor.Visitor;

public class RealType extends AbstractType {

	private RealType() {
		super(0, 0);
	}

	private static RealType instance=new RealType();
	
	
	public static RealType getInstance() { return instance; }

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}
	
	public String toString() {
		return "Double";
	}
	
	@Override
	public Type arithmetic(Type type, ASTNode node) {
		if (type instanceof types.ErrorType)
			return type;
		if (type instanceof RealType)
			return this;
		return new ErrorType(String.format(
				"Arithmetic operations of double does not allow operand with type %s",  type),
				node);
	}

	@Override
	public Type assignment(Type type, ASTNode node) {
		if (type instanceof types.ErrorType)
			return type;
		if (type instanceof RealType)
			return this;
		return new ErrorType(String.format(
				"%s cannot be assigned to double",  type),
				node);
	}
	
	@Override
	public Type comparison(Type type, ASTNode node) {
		if (type instanceof types.ErrorType)
			return type;
		if (type instanceof RealType)
			return this;
		return new ErrorType(String.format(
				"%s cannot be compared to double",  type),
				node);
	}
	
	@Override
	public int numberOfBytes() {
		return 4;
	}
}
