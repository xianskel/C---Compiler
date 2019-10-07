/**
 * Generic type for any AST node. Any node should provide its line and colmun in the source program.
 * @see The default implementation in AbstractASTNode
 * 
 * @author  Francisco Ortin
 */

package ast;

import visitor.Visitor;

public interface ASTNode {
	/**
	 * Number of line and column where the node appears in the source code
	 */
	public int getLine();
	
	public int getColumn();

	public abstract <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param);
	
}

