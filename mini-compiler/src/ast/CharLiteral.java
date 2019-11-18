package ast;

import visitor.Visitor;

public class CharLiteral  extends AbstractExpression {

	public char value;
	
	public CharLiteral(int line, int column, char value) {
		super(line, column);
		this.value=value;
	}

	@Override
	public String toString() {
		return ""+value;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this, param);
	}
}
