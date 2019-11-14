package ast;

import java.util.List;

import types.FuncType;

public class FuncDefinition extends AbstractASTNode implements Definition {

	private FuncType type;
	private String name;
	private List<VarDefinition> varDefinitions;
	private List<Statement> statements;

	
	public FuncDefinition(int line, int column, String name, FuncType type, List<VarDefinition> varDefinitions, List<Statement> statements) {
		super(line, column);
		this.type = type;
		this.name = name;
		this.varDefinitions = varDefinitions;
		this.statements = statements;
	}
	
	public FuncType getType() {
		return this.type;
	}

	public String getName() {
		return this.name;
	}

	public List<Statement> getStatements() {
		return statements;
	}

	public List<VarDefinition> getVarDefinitions() {
		return varDefinitions;
	}

	@Override
	public String toString() {
		return "Function "+this.name+" of type "+type.toString();
	}
}