package ast;

public class UnaryNot extends AbstractUnaryExpression {

	public UnaryNot(int line, int column, Expression operand) {
		super(line, column, operand, "!");
	}

	@Override
	public String toString() {
		return ""+this.getOperator()+this.getOperand();
	}
}