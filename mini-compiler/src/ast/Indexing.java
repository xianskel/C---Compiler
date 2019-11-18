package ast;

import visitor.Visitor;

public class Indexing extends AbstractExpression {
	
	private Expression expression;
	private Expression expression2;

	public Indexing(int line, int column, Expression expression, Expression expression2) {
		super(line, column);
		this.expression = expression;
		this.expression2 = expression2;
	}

	public Expression getExpression() {
		return expression;
	}
	
	public Expression getExpression2() {
		return expression2;
	}

	@Override
	public String toString() {
		return "Array of "+this.expression+"["+expression2+"]";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this, param);
	}
}
