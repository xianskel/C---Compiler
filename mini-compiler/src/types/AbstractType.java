package types;

import java.util.List;

import ast.ASTNode;
import ast.AbstractASTNode;
import ast.Expression;

public abstract class AbstractType extends AbstractASTNode implements Type {

	public AbstractType(int line, int column) {
		super(line, column);
	}
	
	public Type arithmetic(Type type, ASTNode node) {
		return new ErrorType(String.format(
				"Arithmetic operations cannot be performed on type %s",  type),
				node);
	}
	
	public Type assignment(Type type, ASTNode node) {
		return new ErrorType(String.format(
				"Assignment operations cannot be performed on type %s",  type),
				node);
	}
	
	public Type squareBrackets(Type type, ASTNode node) {
		return new ErrorType(String.format(
				"Array Index operations cannot be performed on type %s",  type),
				node);
	}
	
	public Type parenthesis(List<Expression> exp, ASTNode node) {
		return new ErrorType(String.format(
				"Parenthesis operations cannot be performed on type %s",  exp),
				node);
	}
	
	public Type dot(String prop, ASTNode node) {
		return new ErrorType(String.format(
				"Dot notation cannot be performed on type %s",  prop),
				node);
	}
	
	public Type logical(Type type, ASTNode node) {
		return new ErrorType(String.format(
				"Logical operations cannot be performed on type %s",  type),
				node);
	}
	
	public Type comparison(Type type, ASTNode node) {
		return new ErrorType(String.format(
				"Comparison operations cannot be performed on type %s",  type),
				node);
	}
	
	public int numberOfBytes() {
		return 0;
	}

}
