package ast;

import types.Type;
import visitor.Visitor;

public class VarDefinition extends AbstractASTNode implements Definition {

	private Type type;
	private String name;
	private int scope;
	private int offset;
	
	public VarDefinition(int line, int column, String name, Type type) {
		super(line, column);
		this.type = type;
		this.name = name;
	}
	
	public Type getType() {
		return this.type;
	}

	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return ""+name;
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
	
	public void setOffset(int offset) {
		this.offset = offset;
	}
	
	public int getOffset() {
		return this.offset;
	}
}
