/**
  * Internal representation of "double" type in the source language.
  * 
  * @author  Francisco Ortin
  */

package types;

import ast.ASTNode;
import visitor.Visitor;

public class RealType extends AbstractType {

	private RealType()  {
		super(0, 0);
	}
	
	private static RealType instance=new RealType();
	
	
	public static RealType getInstance() { return instance; }

	@Override
	public Type arithmetic(Type type, ASTNode node) {
		if (type instanceof types.ErrorType)
			return type;
		if (type instanceof RealType)
			// double + double -> double
			return this;
		return new ErrorType(String.format(
				"Arithmetic operations of real expressions do not allow a sencond operand with type %s",  type),
				node);
	}

	
	@Override
	public char suffix() {
		return 'f';
	}

	@Override
	public int numberOfBytes() {
		return 4;
	}

	@Override
	public String toString() {
		return "double";
	}

	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}

}
