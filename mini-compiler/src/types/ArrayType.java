package types;

import ast.ASTNode;
import visitor.Visitor;

public class ArrayType extends AbstractType {

	
	private int size;
	private Type type;

	public ArrayType(int size, Type type) {
		super(0, 0);
		this.size = size;
		this.type = type;
	}

	public Type getType() {
		return type;
	}

	public int getSize() {
		return size;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this ,param);
	}
	
	@Override
	public Type squareBrackets(Type type, ASTNode node) {
		if (type instanceof types.ErrorType)
			return type;
		if (type instanceof ArrayType)
			return this;
		return new ErrorType(String.format(
				"Array Index operations cannot be performed on type %s",  type),
				node);
	}
	
	@Override
	public Type assignment(Type type, ASTNode node) {
		if (type instanceof types.ErrorType)
			return type;
		return this.type.assignment(type, node);
	}

}
