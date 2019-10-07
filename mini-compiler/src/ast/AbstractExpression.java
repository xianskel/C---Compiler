/**
 * Default implementation of expressions.
 * 
 * @author  Francisco Ortin
 */

package ast;

import types.Type;

abstract class AbstractExpression extends AbstractASTNode implements Expression {

	public AbstractExpression(int line, int column) {
		super(line, column);
	}

	
	private Type type;
	
	@Override 
	public Type getType() {
		return this.type;
	}
	
	@Override
	public void setType(Type type) {
		this.type = type;
	}
	
}
