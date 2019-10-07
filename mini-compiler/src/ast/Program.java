/**
  * AST node representing a program: a colleciton of variable definitions followed by a
  * collection of statements.
  * 
  * @author  Francisco Ortin
  */

package ast;

import java.util.List;

import visitor.Visitor;

public class Program extends AbstractASTNode {

	/**
	 * Global variables
	 */
	private List<VarDefinition> varDefinitions;
	public List<VarDefinition> getVarDefinitions() {
		return this.varDefinitions;
	}
	
	/**
	 * Statements in the main function
	 */
	private List<Statement> statements;
	public List<Statement> getStatements() {
		return this.statements;
	}
	
	
	public Program(int line, int column, List<VarDefinition> varDefinitions, List<Statement> statements) {
		super(line, column);
		this.varDefinitions = varDefinitions;
		this.statements = statements;
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}
	
	@Override
	public String toString() {
		return String.format("Program with %d variable definitions and %d statements.", 
								this.varDefinitions.size(), this.statements.size());
	}

}
