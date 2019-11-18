package ast;

import visitor.Visitor;

public class UnaryNot extends AbstractUnaryExpression {

	public UnaryNot(int line, int column, Expression operand) {
		super(line, column, operand, "!");
	}

	@Override
	public String toString() {
		return ""+this.getOperator()+this.getOperand();
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this, param);
	}
}