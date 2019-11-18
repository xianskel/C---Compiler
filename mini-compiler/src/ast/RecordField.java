package ast;

import types.Type;
import visitor.Visitor;

public class RecordField extends AbstractExpression {

	public String name;
	public Type type;
	
	public RecordField(int line, int column, String name, Type type) {
		super(line, column);
		this.name=name;
		this.type=type;
	}

	@Override
	public String toString() {
		return ""+name;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this, param);
	}
}
