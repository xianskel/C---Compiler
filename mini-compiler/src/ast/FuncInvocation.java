package ast;

import java.util.List;

public class FuncInvocation extends AbstractExpression implements Statement {

	private String name;
	private List<Expression> params;

	public FuncInvocation(int line, int column, String name, List<Expression> params) {
		super(line, column);
		this.name = name;
		this.params = params;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Expression> getParams() {
		return params;
	}
	
	@Override
	public String toString() {
		return "Function  " + name + " called with " + params.toString();
	}
}
