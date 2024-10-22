package ast;

import visitor.Visitor;

public class Logical extends AbstractBinaryExpression {

	public Logical(int line, int column, Expression operand1, String operator, Expression operand2) {
		super(line, column, operand1, operator, operand2);
	}

	@Override
	public String toString() {
		return ""+this.getOperand1()+this.getOperator()+this.getOperand2();
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this, param);
	}
}