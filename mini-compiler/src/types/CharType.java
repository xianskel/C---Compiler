package types;

public class CharType extends AbstractType {

	public CharType() {
		super(0, 0);
	}
	
	private static CharType instance=new CharType();
	
	
	public static CharType getInstance() { return instance; }

}
