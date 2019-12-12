package types;

import java.util.List;

import ast.ASTNode;
import ast.Expression;

public interface Type extends ASTNode{
	
	public Type arithmetic(Type type, ASTNode astNode);
	
	public Type assignment(Type type, ASTNode astNode);
	
	public Type squareBrackets(Type type, ASTNode astNode);
	
	public Type parenthesis(List<Expression> exps, ASTNode astNode);
	
	public Type dot(String prop, ASTNode astNode);
	
	public Type logical(Type type, ASTNode astNode);
	
	public Type comparison(Type type, ASTNode astNode);
	
	public int numberOfBytes();

}
