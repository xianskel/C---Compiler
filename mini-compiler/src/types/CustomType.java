package types;

import visitor.Visitor;

public class CustomType extends AbstractType {

	private String name;
	
	public CustomType(String name) {
		super(0, 0);
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}
}
