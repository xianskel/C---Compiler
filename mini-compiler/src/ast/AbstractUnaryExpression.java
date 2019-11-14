package ast;

abstract class AbstractUnaryExpression extends AbstractExpression implements Expression {

	private String operator;

	private Expression operand;

	public String getOperator() {
		return operator;
	}

	public Expression getOperand() {
		return operand;
	}

	public AbstractUnaryExpression(int line, int column, Expression operand, String operator) {
		super(line, column);
		this.operator=operator;
		this.operand=operand;
	}

	@Override
	public String toString() {
		return ""+operand+" "+operator;
	}
	
}
