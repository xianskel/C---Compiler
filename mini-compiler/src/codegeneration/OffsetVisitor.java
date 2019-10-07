/**
  * AST traversal that computes the memory offset of all the variables in a program.
  * 
  * @author  Francisco Ortin
  */

package codegeneration;

import ast.*;
import visitor.AbstractVisitor;


public class OffsetVisitor extends AbstractVisitor<Void, Void> {
	
	/**
	 * To compute the offsets of global variables
	 */
	private int bytesGlobalsSum = 0;
	
	@Override
	public Void visit(VarDefinition varDefinition, Void param) {
		varDefinition.setOffset(bytesGlobalsSum);
		bytesGlobalsSum += varDefinition.getType().numberOfBytes();
		return null;
	}

}
