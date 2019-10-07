/**
 * Default implementation of ASTNode.
 * 
 * @author  Francisco Ortin
 */

package ast;

public abstract class AbstractASTNode implements ASTNode {

	private int line, column;
	
	@Override
	public int getLine() {
		return this.line;
	}
	
	@Override
	public int getColumn() {
		return this.column;
	}

	public AbstractASTNode(int line, int column) {
		this.line = line;
		this.column = column;
	}	
	
}

