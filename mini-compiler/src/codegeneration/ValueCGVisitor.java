/**
  * Code generation template to generate the code that pushes the value of one expression.
  * 
  * @author  Francisco Ortin
  */

package codegeneration;

import ast.*;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {

	private AddressCGVisitor addressCGVisitor;

	public ValueCGVisitor(CG cg) {
		super(cg);
		this.addressCGVisitor = new AddressCGVisitor(cg);
	}

	@Override
	public Void visit(Arithmetic arithmetic, Void param) {
		arithmetic.getOperand1().accept(this, null);
		arithmetic.getOperand2().accept(this, null);
		cg.arithmetic(arithmetic.getOperator(), arithmetic.getType());
		return null;
	}

	@Override
	public Void visit(Variable variable, Void param) {
		variable.accept(this.addressCGVisitor, null);
		cg.load(variable.getType());
		return null;
	}

	@Override
	public Void visit(IntLiteral intLiteral, Void param) {
		cg.push(intLiteral.value);
		return null;
	}

	@Override
	public Void visit(RealLiteral realLiteral, Void param) {
		cg.push(realLiteral.value);
		return null;
	}


}
