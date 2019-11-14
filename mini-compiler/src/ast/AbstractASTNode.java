package ast;

public abstract class AbstractASTNode implements ASTNode {

	private int line, column;
	
	public int getLine() {
		return this.line;
	}
	
	public int getColumn() {
		return this.column;
	}

	public AbstractASTNode(int line, int column) {
		this.line = line;
		this.column = column;
	}
}
