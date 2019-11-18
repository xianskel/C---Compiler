package ast;

import types.Type;
import visitor.Visitor;

public class TypeDefinition extends AbstractASTNode implements Definition {
	
	private Type type;
	private String name;
	private int scope;
	
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
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this, param);
	}

	@Override
	public int getScope() {
		return scope;
	}
	
	public void setScope(int scope) {
		this.scope = scope;
	}
}
