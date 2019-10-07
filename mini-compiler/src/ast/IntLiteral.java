/**
  * AST node for integer literals.
  * 
  * @author  Francisco Ortin
  */

package ast;

import visitor.Visitor;

public class IntLiteral extends AbstractExpression {

	public int value;
	
	public IntLiteral(int line, int column, int value) {
		super(line, column);
		this.value=value;
	}

	@Override
	public String toString() {
		return ""+value;
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}
}
