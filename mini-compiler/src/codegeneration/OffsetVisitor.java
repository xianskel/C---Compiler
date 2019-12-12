package codegeneration;

import ast.*;
import visitor.AbstractVisitor;


public class OffsetVisitor extends AbstractVisitor<Void, Void> {

	private int bytesGlobalsSum = 0;
	private int bytesLocalSum = -1;
	
	@Override
	public Void visit(FuncDefinition funcDefinition, Void param) {
		for(VarDefinition defintion: funcDefinition.getType().getVarDefs()) {
			defintion.accept(this, param);
		}
		for(VarDefinition defintion: funcDefinition.getVarDefinitions()) {
			defintion.accept(this, param);
		}
		return null;
	}
	
	@Override
	public Void visit(VarDefinition varDefinition, Void param) {
		int scope = varDefinition.getScope();
		if(scope == 0) {
			varDefinition.setOffset(bytesGlobalsSum);
			bytesGlobalsSum += varDefinition.getType().numberOfBytes();
		} else {
			varDefinition.setOffset(bytesLocalSum);
			bytesLocalSum -= varDefinition.getType().numberOfBytes();
		}
		return null;
	}

}
