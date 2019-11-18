package ast;

import types.Type;

public interface Definition extends ASTNode {
	
	public Type getType();
	
	public String getName(); 
	
	public int getScope();
	
	public void setScope(int scope);
}
