/**
  * Code generation template to generate the code for any statement and variable declaration.
  * 
  * @author  Francisco Ortin
  */

package codegeneration;

import ast.*;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, Void> {

	private AddressCGVisitor addressCGVisitor;
	
	private ValueCGVisitor valueCGVisitor;
	
	public ExecuteCGVisitor(CG cg) {
		super(cg);
		this.valueCGVisitor = new ValueCGVisitor(cg);
		this.addressCGVisitor = new AddressCGVisitor(cg);
	}
		
	@Override
	public Void visit(Write write, Void param) {
		cg.comment("Write");
		write.getExpression().accept(this.valueCGVisitor,null);
		cg.output(write.getExpression().getType());
		return null;
	}
	
	@Override
	public Void visit(Program program, Void param) {
		// * Global variables
		cg.comment("Variable definitions");
		program.getVarDefinitions().forEach(varDef -> varDef.accept(this, null));
		cg.newLine();
		cg.comment("Sentences");
		// * Statements
		program.getStatements().forEach(stmt -> {
			cg.line(stmt);
			stmt.accept(this, null);
			});
		return null;
	}

	@Override
	public Void visit(VarDefinition varDefinition, Void param) {
		cg.declaration(varDefinition);
		return null;
	}

	@Override
	public Void visit(Assignment assignment, Void param) {
		cg.comment("Assignment");
		assignment.getLeftHandSide().accept(this.addressCGVisitor, null); // * lvalue
		assignment.getRightHandSide().accept(this.valueCGVisitor, null); // * rvalue
		cg.store(assignment.getLeftHandSide().getType());
		return null;
	}
	
	
}
