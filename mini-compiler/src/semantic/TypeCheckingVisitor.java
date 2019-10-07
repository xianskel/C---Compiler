/**
  * Second pass of semantic analysis.
  * Infers the type of every (sub)expression in the program,
  * and assigns the inferred type to the expression AST node.
  * 
  * @author  Francisco Ortin
  */

package semantic;

import ast.*;
import visitor.*;
import types.*;

public class TypeCheckingVisitor extends AbstractVisitor<Void, Void> {

	@Override
	public Void visit(Arithmetic exp, Void param) {
		exp.getOperand1().accept(this,null);
		exp.getOperand2().accept(this,null);
		exp.setType(exp.getOperand1().getType().arithmetic(exp.getOperand2().getType(), exp));
		return null;
	}

	@Override
	public Void visit(Variable variable, Void param) {
		variable.setType(variable.getDefinition().getType());
		return null;
	}

	@Override
	public Void visit(IntLiteral intLiteral, Void param) {
		intLiteral.setType(IntType.getInstance());
		return null;
	}

	@Override
	public Void visit(RealLiteral realLiteral, Void param) {
		realLiteral.setType(RealType.getInstance());
		return null;
	}

	@Override
	public Void visit(Assignment assignment, Void param) {
		assignment.getLeftHandSide().accept(this,null);
		assignment.getRightHandSide().accept(this,null);
		assignment.getLeftHandSide().getType()
				.assignment(assignment.getRightHandSide().getType(), assignment);
		return null;
	}
	

}