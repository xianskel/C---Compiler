package ast;

import java.util.List;

public class Write extends AbstractASTNode implements Statement {

	private List<Expression> expressions;
	
	public Write(int line, int column, List<Expression> expressions) {
		super(line, column);
		this.expressions = expressions;
	}

	public List<Expression> getExpressions() {
		return expressions;
	}
	
	@Override
	public String toString() {
		return "write " + expressions;
	}
}
