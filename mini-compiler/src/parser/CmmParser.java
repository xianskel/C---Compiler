// Generated from src/parser/Cmm.g4 by ANTLR 4.7
package parser;

	import ast.*;
	import types.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		WS=39, SINGLE_LINE_COMMENT=40, MULTI_LINE_COMMENT=41, ID=42, INT_CONSTANT=43, 
		REAL_CONSTANT=44, CHAR_CONSTANT=45;
	public static final int
		RULE_program = 0, RULE_definitions = 1, RULE_typeDefinition = 2, RULE_varDefinitions = 3, 
		RULE_varDefinition = 4, RULE_idList = 5, RULE_funcDefinition = 6, RULE_mainDefinition = 7, 
		RULE_typedIdList = 8, RULE_type = 9, RULE_returnType = 10, RULE_allType = 11, 
		RULE_recordFields = 12, RULE_statements = 13, RULE_statement = 14, RULE_statementBlock = 15, 
		RULE_expressionList = 16, RULE_expression = 17;
	public static final String[] ruleNames = {
		"program", "definitions", "typeDefinition", "varDefinitions", "varDefinition", 
		"idList", "funcDefinition", "mainDefinition", "typedIdList", "type", "returnType", 
		"allType", "recordFields", "statements", "statement", "statementBlock", 
		"expressionList", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'typedef'", "';'", "','", "'('", "')'", "'{'", "'}'", "'void'", 
		"'main'", "'int'", "'double'", "'char'", "'type'", "'['", "']'", "'struct'", 
		"'='", "'return'", "'read'", "'write'", "'while'", "'if'", "'else'", "'-'", 
		"'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", 
		"'&&'", "'||'", "'!'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "WS", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "ID", 
		"INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public DefinitionsContext definitions;
		public MainDefinitionContext mainDefinition;
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public MainDefinitionContext mainDefinition() {
			return getRuleContext(MainDefinitionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			((ProgramContext)_localctx).definitions = definitions();
			setState(37);
			((ProgramContext)_localctx).mainDefinition = mainDefinition();
			 
						((ProgramContext)_localctx).definitions.ast.add(((ProgramContext)_localctx).mainDefinition.ast);
						((ProgramContext)_localctx).ast =  new Program((((ProgramContext)_localctx).definitions!=null?(((ProgramContext)_localctx).definitions.start):null).getLine(), (((ProgramContext)_localctx).definitions!=null?(((ProgramContext)_localctx).definitions.start):null).getCharPositionInLine()+1, ((ProgramContext)_localctx).definitions.ast); 
				    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionsContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<Definition>();
		public FuncDefinitionContext funcDefinition;
		public VarDefinitionContext varDefinition;
		public TypeDefinitionContext typeDefinition;
		public List<FuncDefinitionContext> funcDefinition() {
			return getRuleContexts(FuncDefinitionContext.class);
		}
		public FuncDefinitionContext funcDefinition(int i) {
			return getRuleContext(FuncDefinitionContext.class,i);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definitions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(49);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(40);
						((DefinitionsContext)_localctx).funcDefinition = funcDefinition();
						 _localctx.ast.add(((DefinitionsContext)_localctx).funcDefinition.ast); 
						}
						break;
					case 2:
						{
						setState(43);
						((DefinitionsContext)_localctx).varDefinition = varDefinition();
						 _localctx.ast.addAll(((DefinitionsContext)_localctx).varDefinition.ast); 
						}
						break;
					case 3:
						{
						setState(46);
						((DefinitionsContext)_localctx).typeDefinition = typeDefinition();
						 _localctx.ast.add(((DefinitionsContext)_localctx).typeDefinition.ast); 
						}
						break;
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefinitionContext extends ParserRuleContext {
		public TypeDefinition ast;
		public AllTypeContext allType;
		public Token ID;
		public AllTypeContext allType() {
			return getRuleContext(AllTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
			setState(55);
			((TypeDefinitionContext)_localctx).allType = allType(0);
			setState(56);
			((TypeDefinitionContext)_localctx).ID = match(ID);
			setState(57);
			match(T__1);
			 ((TypeDefinitionContext)_localctx).ast =  new TypeDefinition(((TypeDefinitionContext)_localctx).ID.getLine(), ((TypeDefinitionContext)_localctx).ID.getCharPositionInLine()+1, (((TypeDefinitionContext)_localctx).ID!=null?((TypeDefinitionContext)_localctx).ID.getText():null), ((TypeDefinitionContext)_localctx).allType.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefinitionsContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public VarDefinitionContext varDefinition;
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public VarDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinitions; }
	}

	public final VarDefinitionsContext varDefinitions() throws RecognitionException {
		VarDefinitionsContext _localctx = new VarDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15))) != 0)) {
				{
				{
				setState(60);
				((VarDefinitionsContext)_localctx).varDefinition = varDefinition();
				 _localctx.ast.addAll(((VarDefinitionsContext)_localctx).varDefinition.ast); 
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefinitionContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public AllTypeContext allType;
		public IdListContext idList;
		public AllTypeContext allType() {
			return getRuleContext(AllTypeContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((VarDefinitionContext)_localctx).allType = allType(0);
			setState(69);
			((VarDefinitionContext)_localctx).idList = idList();
			setState(70);
			match(T__1);
			 for(String varName: ((VarDefinitionContext)_localctx).idList.ast) 
																_localctx.ast.add(new VarDefinition((((VarDefinitionContext)_localctx).idList!=null?(((VarDefinitionContext)_localctx).idList.start):null).getLine(), (((VarDefinitionContext)_localctx).idList!=null?(((VarDefinitionContext)_localctx).idList.start):null).getCharPositionInLine()+1, varName, ((VarDefinitionContext)_localctx).allType.ast)); 
															
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdListContext extends ParserRuleContext {
		public List<String> ast = new ArrayList<String>();
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			((IdListContext)_localctx).ID = match(ID);
			 _localctx.ast.add((((IdListContext)_localctx).ID!=null?((IdListContext)_localctx).ID.getText():null)); 
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(75);
				match(T__2);
				setState(76);
				((IdListContext)_localctx).ID = match(ID);
				 _localctx.ast.add((((IdListContext)_localctx).ID!=null?((IdListContext)_localctx).ID.getText():null)); 
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDefinitionContext extends ParserRuleContext {
		public FuncDefinition ast;
		public ReturnTypeContext returnType;
		public Token id1;
		public TypedIdListContext typedIdList;
		public VarDefinitionsContext varDefinitions;
		public StatementsContext statements;
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TypedIdListContext typedIdList() {
			return getRuleContext(TypedIdListContext.class,0);
		}
		public VarDefinitionsContext varDefinitions() {
			return getRuleContext(VarDefinitionsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public FuncDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefinition; }
	}

	public final FuncDefinitionContext funcDefinition() throws RecognitionException {
		FuncDefinitionContext _localctx = new FuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			((FuncDefinitionContext)_localctx).returnType = returnType();
			setState(84);
			((FuncDefinitionContext)_localctx).id1 = match(ID);
			setState(85);
			match(T__3);
			setState(86);
			((FuncDefinitionContext)_localctx).typedIdList = typedIdList();
			setState(87);
			match(T__4);
			setState(88);
			match(T__5);
			setState(89);
			((FuncDefinitionContext)_localctx).varDefinitions = varDefinitions();
			setState(90);
			((FuncDefinitionContext)_localctx).statements = statements();
			setState(91);
			match(T__6);
			setState(92);
			match(T__1);
			 
						FuncType type = new FuncType(((FuncDefinitionContext)_localctx).returnType.ast, ((FuncDefinitionContext)_localctx).typedIdList.ast);
						((FuncDefinitionContext)_localctx).ast =  new FuncDefinition(((FuncDefinitionContext)_localctx).id1.getLine(), ((FuncDefinitionContext)_localctx).id1.getCharPositionInLine()+1, 
									(((FuncDefinitionContext)_localctx).id1!=null?((FuncDefinitionContext)_localctx).id1.getText():null), type, ((FuncDefinitionContext)_localctx).varDefinitions.ast, ((FuncDefinitionContext)_localctx).statements.ast); 
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainDefinitionContext extends ParserRuleContext {
		public FuncDefinition ast;
		public VarDefinitionsContext varDefinitions;
		public StatementsContext statements;
		public VarDefinitionsContext varDefinitions() {
			return getRuleContext(VarDefinitionsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public MainDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDefinition; }
	}

	public final MainDefinitionContext mainDefinition() throws RecognitionException {
		MainDefinitionContext _localctx = new MainDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mainDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__7);
			setState(96);
			match(T__8);
			setState(97);
			match(T__3);
			setState(98);
			match(T__4);
			setState(99);
			match(T__5);
			setState(100);
			((MainDefinitionContext)_localctx).varDefinitions = varDefinitions();
			setState(101);
			((MainDefinitionContext)_localctx).statements = statements();
			setState(102);
			match(T__6);
			setState(103);
			match(T__1);
			 
						FuncType type = new FuncType(VoidType.getInstance(), new ArrayList());
						((MainDefinitionContext)_localctx).ast =  new FuncDefinition((((MainDefinitionContext)_localctx).varDefinitions!=null?(((MainDefinitionContext)_localctx).varDefinitions.start):null).getLine(), (((MainDefinitionContext)_localctx).varDefinitions!=null?(((MainDefinitionContext)_localctx).varDefinitions.start):null).getCharPositionInLine()+1, 
									"main" ,type, ((MainDefinitionContext)_localctx).varDefinitions.ast, ((MainDefinitionContext)_localctx).statements.ast); 
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedIdListContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public TypeContext type;
		public Token ID;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public TypedIdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedIdList; }
	}

	public final TypedIdListContext typedIdList() throws RecognitionException {
		TypedIdListContext _localctx = new TypedIdListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typedIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(106);
				((TypedIdListContext)_localctx).type = type();
				setState(107);
				((TypedIdListContext)_localctx).ID = match(ID);
				 _localctx.ast.add(new VarDefinition((((TypedIdListContext)_localctx).type!=null?(((TypedIdListContext)_localctx).type.start):null).getLine(), (((TypedIdListContext)_localctx).type!=null?(((TypedIdListContext)_localctx).type.start):null).getCharPositionInLine()+1, (((TypedIdListContext)_localctx).ID!=null?((TypedIdListContext)_localctx).ID.getText():null), ((TypedIdListContext)_localctx).type.ast)); 
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(109);
					match(T__2);
					setState(110);
					((TypedIdListContext)_localctx).type = type();
					setState(111);
					((TypedIdListContext)_localctx).ID = match(ID);
					 _localctx.ast.add(new VarDefinition((((TypedIdListContext)_localctx).type!=null?(((TypedIdListContext)_localctx).type.start):null).getLine(), (((TypedIdListContext)_localctx).type!=null?(((TypedIdListContext)_localctx).type.start):null).getCharPositionInLine()+1, (((TypedIdListContext)_localctx).ID!=null?((TypedIdListContext)_localctx).ID.getText():null), ((TypedIdListContext)_localctx).type.ast)); 
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T__9);
				 ((TypeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(T__10);
				 ((TypeContext)_localctx).ast =  RealType.getInstance(); 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(T__11);
				 ((TypeContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public Type ast;
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnType);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				((ReturnTypeContext)_localctx).type = type();
				 ((ReturnTypeContext)_localctx).ast =  ((ReturnTypeContext)_localctx).type.ast; 
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__7);
				 ((ReturnTypeContext)_localctx).ast =  VoidType.getInstance(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllTypeContext extends ParserRuleContext {
		public Type ast;
		public AllTypeContext t1;
		public TypeContext type;
		public Token ID;
		public RecordFieldsContext recordFields;
		public Token INT_CONSTANT;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public RecordFieldsContext recordFields() {
			return getRuleContext(RecordFieldsContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public AllTypeContext allType() {
			return getRuleContext(AllTypeContext.class,0);
		}
		public AllTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allType; }
	}

	public final AllTypeContext allType() throws RecognitionException {
		return allType(0);
	}

	private AllTypeContext allType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AllTypeContext _localctx = new AllTypeContext(_ctx, _parentState);
		AllTypeContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_allType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
				{
				setState(137);
				((AllTypeContext)_localctx).type = type();
				 ((AllTypeContext)_localctx).ast =  ((AllTypeContext)_localctx).type.ast; 
				}
				break;
			case T__12:
				{
				setState(140);
				match(T__12);
				setState(141);
				((AllTypeContext)_localctx).ID = match(ID);
				 ((AllTypeContext)_localctx).ast =  new CustomType((((AllTypeContext)_localctx).ID!=null?((AllTypeContext)_localctx).ID.getText():null)); 
				}
				break;
			case T__15:
				{
				setState(143);
				match(T__15);
				setState(144);
				match(T__5);
				setState(145);
				((AllTypeContext)_localctx).recordFields = recordFields();
				setState(146);
				match(T__6);
				 ((AllTypeContext)_localctx).ast =  new StructType(((AllTypeContext)_localctx).recordFields.ast); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AllTypeContext(_parentctx, _parentState);
					_localctx.t1 = _prevctx;
					_localctx.t1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_allType);
					setState(151);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(152);
					match(T__13);
					setState(153);
					((AllTypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
					setState(154);
					match(T__14);
					 ((AllTypeContext)_localctx).ast =  new ArrayType(LexerHelper.lexemeToInt((((AllTypeContext)_localctx).INT_CONSTANT!=null?((AllTypeContext)_localctx).INT_CONSTANT.getText():null)), ((AllTypeContext)_localctx).t1.ast); 
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RecordFieldsContext extends ParserRuleContext {
		public List<RecordField> ast = new ArrayList<RecordField>();
		public AllTypeContext allType;
		public IdListContext idList;
		public List<AllTypeContext> allType() {
			return getRuleContexts(AllTypeContext.class);
		}
		public AllTypeContext allType(int i) {
			return getRuleContext(AllTypeContext.class,i);
		}
		public List<IdListContext> idList() {
			return getRuleContexts(IdListContext.class);
		}
		public IdListContext idList(int i) {
			return getRuleContext(IdListContext.class,i);
		}
		public RecordFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordFields; }
	}

	public final RecordFieldsContext recordFields() throws RecognitionException {
		RecordFieldsContext _localctx = new RecordFieldsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_recordFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15))) != 0)) {
				{
				{
				setState(161);
				((RecordFieldsContext)_localctx).allType = allType(0);
				setState(162);
				((RecordFieldsContext)_localctx).idList = idList();
				setState(163);
				match(T__1);
				 for(String recordName: ((RecordFieldsContext)_localctx).idList.ast) 
												_localctx.ast.add(new RecordField((((RecordFieldsContext)_localctx).allType!=null?(((RecordFieldsContext)_localctx).allType.start):null).getLine(), (((RecordFieldsContext)_localctx).allType!=null?(((RecordFieldsContext)_localctx).allType.start):null).getCharPositionInLine()+1, recordName, ((RecordFieldsContext)_localctx).allType.ast)); 
											
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__36) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(171);
				((StatementsContext)_localctx).statement = statement();
				setState(172);
				match(T__1);
				 _localctx.ast.add(((StatementsContext)_localctx).statement.ast); 
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public ExpressionContext expression;
		public ExpressionListContext expressionList;
		public StatementBlockContext statementBlock;
		public StatementBlockContext s1;
		public StatementBlockContext s2;
		public Token ID;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public List<StatementBlockContext> statementBlock() {
			return getRuleContexts(StatementBlockContext.class);
		}
		public StatementBlockContext statementBlock(int i) {
			return getRuleContext(StatementBlockContext.class,i);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				((StatementContext)_localctx).e1 = expression(0);
				setState(181);
				match(T__16);
				setState(182);
				((StatementContext)_localctx).e2 = expression(0);
				 ((StatementContext)_localctx).ast =  new Assignment((((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getLine(), (((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(T__17);
				setState(186);
				((StatementContext)_localctx).e1 = ((StatementContext)_localctx).expression = expression(0);
				 ((StatementContext)_localctx).ast =  new Return((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(), (((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(T__18);
				setState(190);
				((StatementContext)_localctx).expressionList = expressionList();
				 ((StatementContext)_localctx).ast =  new Read((((StatementContext)_localctx).expressionList!=null?(((StatementContext)_localctx).expressionList.start):null).getLine(), (((StatementContext)_localctx).expressionList!=null?(((StatementContext)_localctx).expressionList.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expressionList.ast); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(T__19);
				setState(194);
				((StatementContext)_localctx).expressionList = expressionList();
				 ((StatementContext)_localctx).ast =  new Write((((StatementContext)_localctx).expressionList!=null?(((StatementContext)_localctx).expressionList.start):null).getLine(), (((StatementContext)_localctx).expressionList!=null?(((StatementContext)_localctx).expressionList.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expressionList.ast); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				match(T__20);
				setState(198);
				((StatementContext)_localctx).expression = expression(0);
				setState(199);
				((StatementContext)_localctx).statementBlock = statementBlock();
				 ((StatementContext)_localctx).ast =  new While((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(), (((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).statementBlock.ast); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				match(T__21);
				setState(203);
				((StatementContext)_localctx).expression = expression(0);
				setState(204);
				((StatementContext)_localctx).statementBlock = statementBlock();
				 ((StatementContext)_localctx).ast =  new IfElse((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(), (((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).statementBlock.ast, new ArrayList<Statement>()); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(207);
				match(T__21);
				setState(208);
				((StatementContext)_localctx).expression = expression(0);
				setState(209);
				((StatementContext)_localctx).s1 = statementBlock();
				setState(210);
				match(T__22);
				setState(211);
				((StatementContext)_localctx).s2 = statementBlock();
				 ((StatementContext)_localctx).ast =  new IfElse((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(), (((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).s1.ast, ((StatementContext)_localctx).s2.ast); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(214);
				((StatementContext)_localctx).ID = match(ID);
				setState(215);
				match(T__3);
				setState(216);
				((StatementContext)_localctx).expressionList = expressionList();
				setState(217);
				match(T__4);
				 ((StatementContext)_localctx).ast =  new FuncInvocation(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine()+1, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), ((StatementContext)_localctx).expressionList.ast); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementBlockContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementsContext statements;
		public StatementContext statement;
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statementBlock);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(T__5);
				setState(223);
				((StatementBlockContext)_localctx).statements = statements();
				setState(224);
				match(T__6);
				 ((StatementBlockContext)_localctx).ast =  ((StatementBlockContext)_localctx).statements.ast; 
				}
				break;
			case T__3:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__23:
			case T__36:
			case ID:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				((StatementBlockContext)_localctx).statement = statement();
				 _localctx.ast.add(((StatementBlockContext)_localctx).statement.ast); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__23) | (1L << T__36) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(232);
				((ExpressionListContext)_localctx).expression = expression(0);
				 _localctx.ast.add(((ExpressionListContext)_localctx).expression.ast); 
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(234);
					match(T__2);
					setState(235);
					((ExpressionListContext)_localctx).expression = expression(0);
					 _localctx.ast.add(((ExpressionListContext)_localctx).expression.ast); 
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext e1;
		public TypeContext type;
		public Token ID;
		public ExpressionListContext expressionList;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token op;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(CmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(246);
				match(T__3);
				setState(247);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(248);
				match(T__4);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast; 
				}
				break;
			case 2:
				{
				setState(251);
				match(T__23);
				setState(252);
				((ExpressionContext)_localctx).e1 = expression(13);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			case 3:
				{
				setState(255);
				match(T__36);
				setState(256);
				((ExpressionContext)_localctx).e1 = expression(8);
				 ((ExpressionContext)_localctx).ast =  new UnaryNot((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			case 4:
				{
				setState(259);
				match(T__3);
				setState(260);
				((ExpressionContext)_localctx).type = type();
				setState(261);
				match(T__4);
				setState(262);
				((ExpressionContext)_localctx).e1 = expression(6);
				 ((ExpressionContext)_localctx).ast =  new Cast((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).type.ast, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			case 5:
				{
				setState(265);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(266);
				match(T__3);
				setState(267);
				((ExpressionContext)_localctx).expressionList = expressionList();
				setState(268);
				match(T__4);
				 ((ExpressionContext)_localctx).ast =  new FuncInvocation(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).expressionList.ast); 
				}
				break;
			case 6:
				{
				setState(271);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			case 7:
				{
				setState(273);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 8:
				{
				setState(275);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new RealLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 9:
				{
				setState(277);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(312);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(282);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(283);
						((ExpressionContext)_localctx).e2 = expression(13);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(287);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__27) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(288);
						((ExpressionContext)_localctx).e2 = expression(12);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(291);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(292);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(293);
						((ExpressionContext)_localctx).e2 = expression(11);
						 ((ExpressionContext)_localctx).ast =  new Comparison((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(296);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(297);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__34 || _la==T__35) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(298);
						((ExpressionContext)_localctx).e2 = expression(10);
						 ((ExpressionContext)_localctx).ast =  new Logical((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e2.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(302);
						match(T__37);
						setState(303);
						((ExpressionContext)_localctx).e2 = expression(8);
						 ((ExpressionContext)_localctx).ast =  new DotNotation((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(306);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(307);
						match(T__13);
						setState(308);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(309);
						match(T__14);
						 ((ExpressionContext)_localctx).ast =  new Indexing((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast); 
						}
						break;
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return allType_sempred((AllTypeContext)_localctx, predIndex);
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean allType_sempred(AllTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0140\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\64"+
		"\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5B\n\5\f\5"+
		"\16\5E\13\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7Q\n\7\f\7\16\7"+
		"T\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nu\n\n"+
		"\f\n\16\nx\13\n\5\nz\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0082\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0098\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u009f\n\r\f\r\16"+
		"\r\u00a2\13\r\3\16\3\16\3\16\3\16\3\16\7\16\u00a9\n\16\f\16\16\16\u00ac"+
		"\13\16\3\17\3\17\3\17\3\17\7\17\u00b2\n\17\f\17\16\17\u00b5\13\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00df\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e9\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u00f1\n\22\f\22\16\22\u00f4\13\22\5\22\u00f6\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011a\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u013b"+
		"\n\23\f\23\16\23\u013e\13\23\3\23\2\4\30$\24\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$\2\6\3\2\33\35\4\2\32\32\36\36\3\2\37$\3\2%&\2\u0154\2"+
		"&\3\2\2\2\4\65\3\2\2\2\68\3\2\2\2\bC\3\2\2\2\nF\3\2\2\2\fK\3\2\2\2\16"+
		"U\3\2\2\2\20a\3\2\2\2\22y\3\2\2\2\24\u0081\3\2\2\2\26\u0088\3\2\2\2\30"+
		"\u0097\3\2\2\2\32\u00aa\3\2\2\2\34\u00b3\3\2\2\2\36\u00de\3\2\2\2 \u00e8"+
		"\3\2\2\2\"\u00f5\3\2\2\2$\u0119\3\2\2\2&\'\5\4\3\2\'(\5\20\t\2()\b\2\1"+
		"\2)\3\3\2\2\2*+\5\16\b\2+,\b\3\1\2,\64\3\2\2\2-.\5\n\6\2./\b\3\1\2/\64"+
		"\3\2\2\2\60\61\5\6\4\2\61\62\b\3\1\2\62\64\3\2\2\2\63*\3\2\2\2\63-\3\2"+
		"\2\2\63\60\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2"+
		"\2\2\67\65\3\2\2\289\7\3\2\29:\5\30\r\2:;\7,\2\2;<\7\4\2\2<=\b\4\1\2="+
		"\7\3\2\2\2>?\5\n\6\2?@\b\5\1\2@B\3\2\2\2A>\3\2\2\2BE\3\2\2\2CA\3\2\2\2"+
		"CD\3\2\2\2D\t\3\2\2\2EC\3\2\2\2FG\5\30\r\2GH\5\f\7\2HI\7\4\2\2IJ\b\6\1"+
		"\2J\13\3\2\2\2KL\7,\2\2LR\b\7\1\2MN\7\5\2\2NO\7,\2\2OQ\b\7\1\2PM\3\2\2"+
		"\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\r\3\2\2\2TR\3\2\2\2UV\5\26\f\2VW\7,"+
		"\2\2WX\7\6\2\2XY\5\22\n\2YZ\7\7\2\2Z[\7\b\2\2[\\\5\b\5\2\\]\5\34\17\2"+
		"]^\7\t\2\2^_\7\4\2\2_`\b\b\1\2`\17\3\2\2\2ab\7\n\2\2bc\7\13\2\2cd\7\6"+
		"\2\2de\7\7\2\2ef\7\b\2\2fg\5\b\5\2gh\5\34\17\2hi\7\t\2\2ij\7\4\2\2jk\b"+
		"\t\1\2k\21\3\2\2\2lm\5\24\13\2mn\7,\2\2nv\b\n\1\2op\7\5\2\2pq\5\24\13"+
		"\2qr\7,\2\2rs\b\n\1\2su\3\2\2\2to\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2"+
		"\2wz\3\2\2\2xv\3\2\2\2yl\3\2\2\2yz\3\2\2\2z\23\3\2\2\2{|\7\f\2\2|\u0082"+
		"\b\13\1\2}~\7\r\2\2~\u0082\b\13\1\2\177\u0080\7\16\2\2\u0080\u0082\b\13"+
		"\1\2\u0081{\3\2\2\2\u0081}\3\2\2\2\u0081\177\3\2\2\2\u0082\25\3\2\2\2"+
		"\u0083\u0084\5\24\13\2\u0084\u0085\b\f\1\2\u0085\u0089\3\2\2\2\u0086\u0087"+
		"\7\n\2\2\u0087\u0089\b\f\1\2\u0088\u0083\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\27\3\2\2\2\u008a\u008b\b\r\1\2\u008b\u008c\5\24\13\2\u008c\u008d\b\r"+
		"\1\2\u008d\u0098\3\2\2\2\u008e\u008f\7\17\2\2\u008f\u0090\7,\2\2\u0090"+
		"\u0098\b\r\1\2\u0091\u0092\7\22\2\2\u0092\u0093\7\b\2\2\u0093\u0094\5"+
		"\32\16\2\u0094\u0095\7\t\2\2\u0095\u0096\b\r\1\2\u0096\u0098\3\2\2\2\u0097"+
		"\u008a\3\2\2\2\u0097\u008e\3\2\2\2\u0097\u0091\3\2\2\2\u0098\u00a0\3\2"+
		"\2\2\u0099\u009a\f\4\2\2\u009a\u009b\7\20\2\2\u009b\u009c\7-\2\2\u009c"+
		"\u009d\7\21\2\2\u009d\u009f\b\r\1\2\u009e\u0099\3\2\2\2\u009f\u00a2\3"+
		"\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\31\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a4\5\30\r\2\u00a4\u00a5\5\f\7\2\u00a5\u00a6\7"+
		"\4\2\2\u00a6\u00a7\b\16\1\2\u00a7\u00a9\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\33\3\2\2"+
		"\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\5\36\20\2\u00ae\u00af\7\4\2\2\u00af"+
		"\u00b0\b\17\1\2\u00b0\u00b2\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b2\u00b5\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\35\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\5$\23\2\u00b7\u00b8\7\23\2\2\u00b8\u00b9\5"+
		"$\23\2\u00b9\u00ba\b\20\1\2\u00ba\u00df\3\2\2\2\u00bb\u00bc\7\24\2\2\u00bc"+
		"\u00bd\5$\23\2\u00bd\u00be\b\20\1\2\u00be\u00df\3\2\2\2\u00bf\u00c0\7"+
		"\25\2\2\u00c0\u00c1\5\"\22\2\u00c1\u00c2\b\20\1\2\u00c2\u00df\3\2\2\2"+
		"\u00c3\u00c4\7\26\2\2\u00c4\u00c5\5\"\22\2\u00c5\u00c6\b\20\1\2\u00c6"+
		"\u00df\3\2\2\2\u00c7\u00c8\7\27\2\2\u00c8\u00c9\5$\23\2\u00c9\u00ca\5"+
		" \21\2\u00ca\u00cb\b\20\1\2\u00cb\u00df\3\2\2\2\u00cc\u00cd\7\30\2\2\u00cd"+
		"\u00ce\5$\23\2\u00ce\u00cf\5 \21\2\u00cf\u00d0\b\20\1\2\u00d0\u00df\3"+
		"\2\2\2\u00d1\u00d2\7\30\2\2\u00d2\u00d3\5$\23\2\u00d3\u00d4\5 \21\2\u00d4"+
		"\u00d5\7\31\2\2\u00d5\u00d6\5 \21\2\u00d6\u00d7\b\20\1\2\u00d7\u00df\3"+
		"\2\2\2\u00d8\u00d9\7,\2\2\u00d9\u00da\7\6\2\2\u00da\u00db\5\"\22\2\u00db"+
		"\u00dc\7\7\2\2\u00dc\u00dd\b\20\1\2\u00dd\u00df\3\2\2\2\u00de\u00b6\3"+
		"\2\2\2\u00de\u00bb\3\2\2\2\u00de\u00bf\3\2\2\2\u00de\u00c3\3\2\2\2\u00de"+
		"\u00c7\3\2\2\2\u00de\u00cc\3\2\2\2\u00de\u00d1\3\2\2\2\u00de\u00d8\3\2"+
		"\2\2\u00df\37\3\2\2\2\u00e0\u00e1\7\b\2\2\u00e1\u00e2\5\34\17\2\u00e2"+
		"\u00e3\7\t\2\2\u00e3\u00e4\b\21\1\2\u00e4\u00e9\3\2\2\2\u00e5\u00e6\5"+
		"\36\20\2\u00e6\u00e7\b\21\1\2\u00e7\u00e9\3\2\2\2\u00e8\u00e0\3\2\2\2"+
		"\u00e8\u00e5\3\2\2\2\u00e9!\3\2\2\2\u00ea\u00eb\5$\23\2\u00eb\u00f2\b"+
		"\22\1\2\u00ec\u00ed\7\5\2\2\u00ed\u00ee\5$\23\2\u00ee\u00ef\b\22\1\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00ea\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6#\3\2\2\2\u00f7\u00f8\b\23\1\2"+
		"\u00f8\u00f9\7\6\2\2\u00f9\u00fa\5$\23\2\u00fa\u00fb\7\7\2\2\u00fb\u00fc"+
		"\b\23\1\2\u00fc\u011a\3\2\2\2\u00fd\u00fe\7\32\2\2\u00fe\u00ff\5$\23\17"+
		"\u00ff\u0100\b\23\1\2\u0100\u011a\3\2\2\2\u0101\u0102\7\'\2\2\u0102\u0103"+
		"\5$\23\n\u0103\u0104\b\23\1\2\u0104\u011a\3\2\2\2\u0105\u0106\7\6\2\2"+
		"\u0106\u0107\5\24\13\2\u0107\u0108\7\7\2\2\u0108\u0109\5$\23\b\u0109\u010a"+
		"\b\23\1\2\u010a\u011a\3\2\2\2\u010b\u010c\7,\2\2\u010c\u010d\7\6\2\2\u010d"+
		"\u010e\5\"\22\2\u010e\u010f\7\7\2\2\u010f\u0110\b\23\1\2\u0110\u011a\3"+
		"\2\2\2\u0111\u0112\7,\2\2\u0112\u011a\b\23\1\2\u0113\u0114\7-\2\2\u0114"+
		"\u011a\b\23\1\2\u0115\u0116\7.\2\2\u0116\u011a\b\23\1\2\u0117\u0118\7"+
		"/\2\2\u0118\u011a\b\23\1\2\u0119\u00f7\3\2\2\2\u0119\u00fd\3\2\2\2\u0119"+
		"\u0101\3\2\2\2\u0119\u0105\3\2\2\2\u0119\u010b\3\2\2\2\u0119\u0111\3\2"+
		"\2\2\u0119\u0113\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u013c\3\2\2\2\u011b\u011c\f\16\2\2\u011c\u011d\t\2\2\2\u011d\u011e\5"+
		"$\23\17\u011e\u011f\b\23\1\2\u011f\u013b\3\2\2\2\u0120\u0121\f\r\2\2\u0121"+
		"\u0122\t\3\2\2\u0122\u0123\5$\23\16\u0123\u0124\b\23\1\2\u0124\u013b\3"+
		"\2\2\2\u0125\u0126\f\f\2\2\u0126\u0127\t\4\2\2\u0127\u0128\5$\23\r\u0128"+
		"\u0129\b\23\1\2\u0129\u013b\3\2\2\2\u012a\u012b\f\13\2\2\u012b\u012c\t"+
		"\5\2\2\u012c\u012d\5$\23\f\u012d\u012e\b\23\1\2\u012e\u013b\3\2\2\2\u012f"+
		"\u0130\f\t\2\2\u0130\u0131\7(\2\2\u0131\u0132\5$\23\n\u0132\u0133\b\23"+
		"\1\2\u0133\u013b\3\2\2\2\u0134\u0135\f\20\2\2\u0135\u0136\7\20\2\2\u0136"+
		"\u0137\5$\23\2\u0137\u0138\7\21\2\2\u0138\u0139\b\23\1\2\u0139\u013b\3"+
		"\2\2\2\u013a\u011b\3\2\2\2\u013a\u0120\3\2\2\2\u013a\u0125\3\2\2\2\u013a"+
		"\u012a\3\2\2\2\u013a\u012f\3\2\2\2\u013a\u0134\3\2\2\2\u013b\u013e\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d%\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\25\63\65CRvy\u0081\u0088\u0097\u00a0\u00aa\u00b3\u00de\u00e8"+
		"\u00f2\u00f5\u0119\u013a\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}