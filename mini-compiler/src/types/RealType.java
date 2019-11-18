package types;

import visitor.Visitor;

public class RealType extends AbstractType {

	private RealType() {
		super(0, 0);
	}

	private static RealType instance=new RealType();
	
	
	public static RealType getInstance() { return instance; }

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}
}
