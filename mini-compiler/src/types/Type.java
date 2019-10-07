/**
  * This type generalizes any type in the compiler.
  * Besides representing types, they also hold responsibilities of semantic analysis and code generation.
  * @see AbstractType for the default implementation.
  * 
  * @author  Francisco Ortin
  */

package types;


import ast.ASTNode;

public interface Type extends ASTNode {
	
	
	/******** Semantic analysis ***************/
	
	public Type arithmetic(Type type, ASTNode astNode);
	
	public Type assignment(Type type, ASTNode astNode);

	/******** Code Generation ***************/
	
	public  char suffix();
	
	public  int numberOfBytes();
	
	
}
