package ast;

import types.Type;

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
}
