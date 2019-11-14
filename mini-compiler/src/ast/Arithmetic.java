package ast;

public class Arithmetic extends AbstractBinaryExpression {

	public Arithmetic(int line, int column, Expression operand1, String operator, Expression operand2) {
		super(line, column, operand1, operator, operand2);
	}

	@Override
	public String toString() {
		return ""+this.getOperand1()+this.getOperator()+this.getOperand2();
	}
}