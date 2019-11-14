package ast;

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
}
