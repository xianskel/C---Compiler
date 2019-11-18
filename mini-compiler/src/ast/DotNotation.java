package ast;

import visitor.Visitor;

public class DotNotation extends AbstractBinaryExpression {

	public DotNotation(int line, int column, Expression expression1, Expression expression2) {
		super(line, column, expression1, ".", expression2);
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this, param);
	}
}
