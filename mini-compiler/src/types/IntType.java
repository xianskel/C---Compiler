package types;

import visitor.Visitor;

public class IntType extends AbstractType {

	private IntType() {
		super(0, 0);
	}

	private static IntType instance=new IntType();
	
	
	public static IntType getInstance() { return instance; }
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}
}
