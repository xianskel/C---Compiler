package ast;

import types.Type;
import visitor.Visitor;

public class VarDefinition extends AbstractASTNode implements Definition {

	private Type type;
	private String name;

	
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
}
