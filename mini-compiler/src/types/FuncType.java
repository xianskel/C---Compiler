package types;

import java.util.List;

import ast.VarDefinition;
import visitor.Visitor;

public class FuncType extends AbstractType {
	
	private Type returnType;
	private List<VarDefinition> varDefinitions;

	public FuncType(Type returnType, List<VarDefinition> varDefinitions) {
		super(0, 0);
		this.returnType = returnType;
		this.varDefinitions = varDefinitions;
	}

	public Type getReturnType() {
		return returnType;
	}

	public List<VarDefinition> getVarDefinitions() {
		return varDefinitions;
	}
	
	@Override
	public String toString() {
		return "Returns "+this.returnType+" from "+varDefinitions.toString();
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}

}
