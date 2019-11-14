package types;

import java.util.List;

import ast.RecordField;

public class StructType extends AbstractType {

	private  List<RecordField> records;
	
	public StructType(List<RecordField> records) {
		super(0, 0);
		this.records = records;
	}
	
	public List<RecordField> getRecords() {
		return records;
	}
}
