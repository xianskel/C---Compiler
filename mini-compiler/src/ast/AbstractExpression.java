package ast;

import types.Type;

abstract class AbstractExpression extends AbstractASTNode implements Expression {
	
	private Type type;

	public AbstractExpression(int line, int column) {
		super(line, column);
	}
		
	@Override 
	public Type getType() {
		return this.type;
	}
	
	@Override
	public void setType(Type type) {
		this.type = type;
	}
}
