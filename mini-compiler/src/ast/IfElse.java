package ast;

import java.util.List;

import visitor.Visitor;

public class IfElse extends AbstractASTNode implements Statement {

	private Expression expression;
	private List<Statement> ifStatements;
	private List<Statement> elseStatements;

	public IfElse(int line, int column, Expression expression, List<Statement> ifStatements, List<Statement> elseStatements) {
		super(line, column);
		this.expression = expression;
		this.ifStatements = ifStatements;
		this.elseStatements = elseStatements;
	}
	
	public Expression getExpression() {
		return expression;
	}
	
	public List<Statement> getIfStatements() {
		return ifStatements;
	}
	
	public List<Statement> getElseStatements() {
		return elseStatements;
	}
	
	@Override
	public String toString() {
		return "If " + expression + ifStatements + " else " + elseStatements;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this, param);
	}
}
