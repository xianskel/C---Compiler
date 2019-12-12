package ast;

import types.Type;
import visitor.Visitor;

public class Return extends AbstractASTNode implements Statement {

	private Expression expression;
	
	public Return(int line, int column, Expression expression) {
		super(line, column);
		this.expression = expression;
	}

	public Expression getExpression() {
		return expression;
	}
	
	@Override
	public String toString() {
		return "return " + expression;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this, param);
	}
	
	public Type getReturnType() {
		return this.expression.getType();
	}
}
