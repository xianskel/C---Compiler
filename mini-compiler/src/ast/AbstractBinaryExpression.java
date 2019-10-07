/**
 * Default implementation for binary expressions.
 * 
 * @author  Francisco Ortin
 */

package ast;

abstract class AbstractBinaryExpression extends AbstractExpression implements Expression {

	private String operator;

	private Expression operand1;

	private Expression operand2;

	public String getOperator() {
		return operator;
	}

	public Expression getOperand1() {
		return operand1;
	}

	public Expression getOperand2() {
		return operand2;
	}

	public AbstractBinaryExpression(int line, int column, Expression operand1, String operator, Expression operand2) {
		super(line, column);
		this.operator=operator;
		this.operand1=operand1;
		this.operand2=operand2;
	}

	@Override
	public String toString() {
		return ""+operand1+" "+operator+" "+operand2;
	}
	
}
