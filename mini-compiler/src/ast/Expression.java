/**
  * General type for expressions.
  * @see The default implementation in the AbstractExpression class
  * 
  * @author  Francisco Ortin
  */

package ast;

import types.Type;


public interface Expression extends ASTNode {
	
	/**
	 * The type of the expression
	 */
	public Type getType();
	public void setType(Type tipo);
}
