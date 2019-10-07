// Generated from Z:/Users/ortin/Dropbox/Asignaturas/PLD-CIT/labs/lab01/students/mini-compiler/src/parser/Cmm.g4 by ANTLR 4.7

	package parser;

	import ast.*;
	import types.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmmParser}.
 */
public interface CmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CmmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CmmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#varDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterVarDefinitions(CmmParser.VarDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#varDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitVarDefinitions(CmmParser.VarDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CmmParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CmmParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(CmmParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(CmmParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CmmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CmmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CmmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CmmParser.ExpressionContext ctx);
}