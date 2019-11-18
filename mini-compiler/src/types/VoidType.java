package types;

import visitor.Visitor;

public class VoidType extends AbstractType {

	public VoidType() {
		super(0, 0);
	}
	
	private static VoidType instance=new VoidType();
	
	
	public static VoidType getInstance() { return instance; }

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}
}
