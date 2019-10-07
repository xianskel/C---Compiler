/**
  * Default implementation of the Visitor design pattern for code generation.
  * A runtime error is generated, indicated that the code generation template has not been defined.
  * 
  * @author  Francisco Ortin
  */

package codegeneration;

import types.*;
import visitor.Visitor;
import ast.*;

public abstract class AbstractCGVisitor<TP, TR> implements Visitor<TP, TR> {

	/**
	 * Handles the code generation responsibilities
	 */
	protected CG cg;

	public CG getCG() {
		return this.cg;
	}
	
	public AbstractCGVisitor(CG cg) {
		this.cg=cg;
	}
	
	@Override	
	public TR visit(Variable variable, TP param) {
		throw new IllegalStateException("Code generation template \"Variable\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public TR visit(IntLiteral intLiteral, TP param) {
		throw new IllegalStateException("Code generation template \"IntLiteral\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public TR visit(RealLiteral realLiteral, TP param) {
		throw new IllegalStateException("Code generation template \"RealLiteral\" not defined for the code function " +
				this.getClass().getName()); 
	}
	
	@Override
	public TR visit(Assignment assignment, TP param) {
		throw new IllegalStateException("Code generation template \"Assignment\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public TR visit(Write write, TP param) {
		throw new IllegalStateException("Code generation template \"Write\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public TR visit(Program program, TP param) {
		throw new IllegalStateException("Code generation template \"Program\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public TR visit(VarDefinition varDefinition, TP param) {
		throw new IllegalStateException("Code generation template \"VarDefinition\" not defined for the code function " +
				this.getClass().getName()); 
	}


	@Override
	public TR visit(IntType intType, TP param) {
		throw new IllegalStateException("Code generation template \"IntType\" not defined for the code function " +
				this.getClass().getName()); 
	}

	@Override
	public TR visit(ErrorType errorType, TP param) {
		throw new IllegalStateException("Code generation template \"ErrorType\" not defined for the code function " +
				this.getClass().getName()); 
	}


	@Override
	public TR visit(RealType realType, TP param) {
		throw new IllegalStateException("Code generation template \"RealType\" not defined for the code function " +
				this.getClass().getName()); 
	}


	@Override
	public TR visit(Arithmetic arithmetic, TP param) {
		throw new IllegalStateException("Code generation template \"Arithmetic\" not defined for the code function " +
				this.getClass().getName()); 
	}



}
