package types;

public class ArrayType extends AbstractType {

	
	private int size;
	private Type type;

	public ArrayType(int size, Type type) {
		super(0, 0);
		this.size = size;
		this.type = type;
	}

	public Type getType() {
		return type;
	}

	public int getSize() {
		return size;
	}

}
