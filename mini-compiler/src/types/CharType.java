package types;

import visitor.Visitor;

public class CharType extends AbstractType {

	public CharType() {
		super(0, 0);
	}
	
	private static CharType instance=new CharType();
	
	
	public static CharType getInstance() { return instance; }
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}

}
