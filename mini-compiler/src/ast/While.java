package ast;

import java.util.List;

public class While extends AbstractASTNode implements Statement {

	private Expression expression;
	private List<Statement> statements;

	public While(int line, int column, Expression expression, List<Statement> statements) {
		super(line, column);
		this.expression = expression;
		this.statements = statements;
	}
	
	public Expression getExpression() {
		return expression;
	}
	
	public List<Statement> getStatements() {
		return statements;
	}
	
	@Override
	public String toString() {
		return "While " + expression;
	}
}
