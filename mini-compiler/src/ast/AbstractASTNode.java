package ast;

public abstract class AbstractASTNode implements ASTNode {

	private int line, column;
	private boolean lValue;
	
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

	public boolean getlValue() {
		return lValue;
	}

	public void setlValue(boolean lValue) {
		this.lValue = lValue;
	}
}
