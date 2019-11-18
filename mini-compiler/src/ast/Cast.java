package ast;

import types.Type;
import visitor.Visitor;

public class Cast extends AbstractExpression {

	private Expression expression;
	private Type type;

	public Cast(int line, int column, Type type, Expression expression) {
		super(line, column);
		this.expression = expression;
		this.type = type;
	}

	@Override
	public String toString() {
		return "cast " + this.expression + " to " + this.type;
	}
	
	public Expression getExpression() {
		return expression;
	}
	
	public Type getType() {
		return type;
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this, param);
	}
}
