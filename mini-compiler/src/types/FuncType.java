package types;

import java.util.List;

import ast.VarDefinition;

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

}
