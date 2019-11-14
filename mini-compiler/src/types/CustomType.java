package types;

public class CustomType extends AbstractType {

	private String name;
	
	public CustomType(String name) {
		super(0, 0);
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
