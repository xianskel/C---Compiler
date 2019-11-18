package semantic;

import types.*;
import visitor.*;
import ast.*;
import symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {
	
	private final SymbolTable st = new SymbolTable();

	@Override
	public Void visit(Variable variable, Void param) {
		variable.setDefinition(st.find(variable.getName()));
		if (variable.getDefinition() == null)
			variable.setDefinition(new VarDefinition(variable.getLine(), variable.getColumn(), variable.getName(),
					new ErrorType("Variable "+variable.getName()+" not defined",variable)));
		return null;
	}
	
	@Override
	public Void visit(FuncInvocation funcInvoc, Void param) {
		funcInvoc.setDefinition(st.find(funcInvoc.getName()));
		if (funcInvoc.getDefinition() == null)
			funcInvoc.setDefinition(new VarDefinition(funcInvoc.getLine(), funcInvoc.getColumn(), funcInvoc.getName(),
					new ErrorType("Function "+funcInvoc.getName()+" not defined",funcInvoc)));
		return null;
	}

	@Override
	public Void visit(VarDefinition definition, Void param) {
		if (!st.insert(definition)) 
			new ErrorType("The variable " + definition.getName()
					+ " has already been defined", definition);
		return null;
	}
	
	@Override
	public Void visit(FuncDefinition funcDefinition, Void param) {
		if (!st.insert(funcDefinition)) 
		new ErrorType("The function " + funcDefinition.getName()
				+ " has already been defined", funcDefinition);
		else {
			st.set();
			for(VarDefinition defintion: funcDefinition.getType().getVarDefinitions())
				defintion.accept(this, param);
			for(VarDefinition defintion: funcDefinition.getVarDefinitions())
				defintion.accept(this, param);
			for(Statement statement: funcDefinition.getStatements())
				statement.accept(this, param);
			st.reset();
		}
		return null;
	}
	
	@Override
	public Void visit(Return rStatement, Void param) {
		rStatement.getExpression().accept(this, param);
		return null;
	}
	
	@Override
	public Void visit(Read read, Void param) {
		read.getExpression().accept(this, param);
		return null;
	}

}
