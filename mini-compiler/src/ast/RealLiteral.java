/**
  * AST node for real literals.
  * 
  * @author  Francisco Ortin
  */
package ast;

import visitor.Visitor;

public class RealLiteral extends AbstractExpression {

	public double value;
	
	public RealLiteral(int line, int column, double value) {
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
