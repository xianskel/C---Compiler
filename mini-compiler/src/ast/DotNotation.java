package ast;

public class DotNotation extends AbstractExpression {
	
	private Expression expression;
	private Expression expression2;

	public DotNotation(int line, int column, Expression expression, Expression expression2) {
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
		return "Access to of "+this.expression+"."+expression2;
	}
}
