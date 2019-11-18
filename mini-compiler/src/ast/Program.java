package ast;

import java.util.List;

import visitor.Visitor;


public class Program extends AbstractASTNode {

	//Global function and variable definitions
	private List<Definition> definitions;
	
	public Program(int line, int column,List<Definition> definitions) {
		super(line, column);
		this.definitions = definitions;
	}
	
	public List<Definition> getDefinitions() {
		return this.definitions;
	}
	
	@Override
	public String toString() {
		return "Program";
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this, param);
	}
}
