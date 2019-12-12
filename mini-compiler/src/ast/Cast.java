package ast;

import types.Type;
import visitor.Visitor;

public class Cast extends AbstractExpression {

	private Expression expression;
	private Type castType;

	public Cast(int line, int column, Type type, Expression expression) {
		super(line, column);
		this.expression = expression;
		this.castType = type;
	}

	@Override
	public String toString() {
		return "cast " + this.expression + " to " + this.castType;
	}
	
	public Expression getExpression() {
		return expression;
	}
	
	public Type getCastType() {
		return castType;
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this, param);
	}
}
