package ast;

import types.Type;

public class TypeDefinition extends AbstractASTNode implements Definition {
	
	private Type type;
	private String name;

	public TypeDefinition(int line, int column, String name, Type type) {
		super(line, column);
		this.type = type;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Type getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return "Type "+this.name+" of type "+type;
	}

}
