package types;

public class RealType extends AbstractType {

	private RealType() {
		super(0, 0);
	}

	private static RealType instance=new RealType();
	
	
	public static RealType getInstance() { return instance; }

}
