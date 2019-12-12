package types;

import java.util.List;

import ast.ASTNode;
import ast.Expression;
import ast.VarDefinition;
import visitor.Visitor;

public class FuncType extends AbstractType {
	
	private Type returnType;
	private List<VarDefinition> varDefs;

	public FuncType(Type returnType, List<VarDefinition> varDefs) {
		super(0, 0);
		this.returnType = returnType;
		this.varDefs = varDefs;
	}

	public Type getReturnType() {
		return returnType;
	}

	public List<VarDefinition> getVarDefs() {
		return varDefs;
	}
	
	@Override
	public String toString() {
		return "Returns "+this.returnType+" from "+varDefs.toString();
	}
	
	@Override
	public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param) {
		return visitor.visit(this,param);
	}
	
	@Override
	public Type parenthesis(List<Expression> exps, ASTNode node) {
		for(int i=0; i<this.varDefs.size(); i++) {
			if(exps.size() != this.varDefs.size())
				return new ErrorType(String.format(
						"Incorrect number of parameter expected %s, found %s", 
						varDefs.size(), exps.size()),
						node);
			if(exps.get(i).getType() instanceof types.ErrorType)
				return exps.get(i).getType();
			if(!exps.get(i).getType().equals(this.varDefs.get(i).getType()))
				return new ErrorType(String.format(
						"Invalid function parameter %s, expected %s, found %s",  
						exps.get(i), varDefs.get(i).getType(), exps.get(i).getType()),
						node);
		}
		return this;
	}
}
