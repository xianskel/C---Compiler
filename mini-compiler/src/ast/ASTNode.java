package ast;

import visitor.Visitor;

public interface ASTNode {

	public int getLine();
	
	public int getColumn();
	
	public String toString();
	
	public boolean getlValue();
	
	public abstract <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param);
}
