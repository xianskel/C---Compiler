package types;

import ast.ASTNode;
import visitor.Visitor;

public class CharType extends AbstractType {

	public CharType() {
		super(0, 0);
	}
	
	private static CharType instance=new CharType();
	
	
	public static CharType getInstance() { return instance; }
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}

	@Override
	public Type assignment(Type type, ASTNode node) {
		if (type instanceof types.ErrorType)
			return type;
		if (type instanceof CharType)
			return this;
		return new ErrorType(String.format(
				"%s cannot be assigned to char",  type),
				node);
	}
	
	public String toString() {
		return "Char";
	}
	
	@Override
	public int numberOfBytes() {
		return 1;
	}
}
