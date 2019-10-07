/**
 * AST node for binary arithmetic expressions (operators + - * / %)
 * 
 * @author  Francisco Ortin
 */

package ast;

import visitor.Visitor;

public class Arithmetic extends AbstractBinaryExpression {

	public Arithmetic(int line, int column, Expression operand1, String operator, Expression operand2) {
		super(line, column, operand1, operator, operand2);
	}

	@Override
	public String toString() {
		return ""+this.getOperand1()+this.getOperator()+this.getOperand2();
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}
}
