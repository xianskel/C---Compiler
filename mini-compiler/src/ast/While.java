package ast;

import java.util.List;

import visitor.Visitor;

public class While extends AbstractExpression implements Statement {

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
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this, param);
	}
}
