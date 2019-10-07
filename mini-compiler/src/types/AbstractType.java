/**
  * Default implementation of Type.
  * 
  * @author  Francisco Ortin
  */

package types;


import ast.*;


public abstract class AbstractType extends AbstractASTNode implements Type {
	
	public AbstractType(int line, int column) {
		super(line, column);
	}
	
	/******** Semantic Analysis ***************/
	
	@Override
	public Type arithmetic(Type type, ASTNode node) {
		// * By default, not allowed (type error)
		return new ErrorType("An arithmetic expression cannot be performed with the types " + this.getClass().getSimpleName() + " and " + type.getClass().getSimpleName() + ".", node); 
	}
	

	@Override
	public Type assignment(Type type, ASTNode node) {
		if (type instanceof types.ErrorType)
			return type;
		if (this.getClass().equals(type.getClass()))
			// * Both operands have the same type
			return type;
		return new ErrorType("Assignments require left- and right-hand sides to have the same type", node);
	}


	/******** Code Generation ***************/
	
	@Override
	public abstract char suffix();
	
	@Override
	public abstract int numberOfBytes();
	
	
	/************ Debugging *************************
	 * Implement toString to show a representation of the type expression
	 */
	
}
