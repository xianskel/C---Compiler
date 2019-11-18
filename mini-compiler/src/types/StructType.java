package types;

import java.util.List;

import ast.RecordField;
import visitor.Visitor;

public class StructType extends AbstractType {

	private  List<RecordField> records;
	
	public StructType(List<RecordField> records) {
		super(0, 0);
		this.records = records;
	}
	
	public List<RecordField> getRecords() {
		return records;
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}
}
