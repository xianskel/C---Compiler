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
			setState(94);
			match(T__7);
			setState(95);
			match(T__8);
			setState(96);
			match(T__3);
			setState(97);
			match(T__4);
			setState(98);
			match(T__5);
			setState(99);
			((MainDefinitionContext)_localctx).varDefinitions = varDefinitions();
			setState(100);
			((MainDefinitionContext)_localctx).statements = statements();
			setState(101);
			match(T__6);
			 
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
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(104);
				((TypedIdListContext)_localctx).type = type();
				setState(105);
				((TypedIdListContext)_localctx).ID = match(ID);
				 _localctx.ast.add(new VarDefinition((((TypedIdListContext)_localctx).type!=null?(((TypedIdListContext)_localctx).type.start):null).getLine(), (((TypedIdListContext)_localctx).type!=null?(((TypedIdListContext)_localctx).type.start):null).getCharPositionInLine()+1, (((TypedIdListContext)_localctx).ID!=null?((TypedIdListContext)_localctx).ID.getText():null), ((TypedIdListContext)_localctx).type.ast)); 
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(107);
					match(T__2);
					setState(108);
					((TypedIdListContext)_localctx).type = type();
					setState(109);
					((TypedIdListContext)_localctx).ID = match(ID);
					 _localctx.ast.add(new VarDefinition((((TypedIdListContext)_localctx).type!=null?(((TypedIdListContext)_localctx).type.start):null).getLine(), (((TypedIdListContext)_localctx).type!=null?(((TypedIdListContext)_localctx).type.start):null).getCharPositionInLine()+1, (((TypedIdListContext)_localctx).ID!=null?((TypedIdListContext)_localctx).ID.getText():null), ((TypedIdListContext)_localctx).type.ast)); 
					}
					}
					setState(116);
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
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__9);
				 ((TypeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(T__10);
				 ((TypeContext)_localctx).ast =  RealType.getInstance(); 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
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
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				((ReturnTypeContext)_localctx).type = type();
				 ((ReturnTypeContext)_localctx).ast =  ((ReturnTypeContext)_localctx).type.ast; 
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
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
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
				{
				setState(135);
				((AllTypeContext)_localctx).type = type();
				 ((AllTypeContext)_localctx).ast =  ((AllTypeContext)_localctx).type.ast; 
				}
				break;
			case T__12:
				{
				setState(138);
				match(T__12);
				setState(139);
				((AllTypeContext)_localctx).ID = match(ID);
				 ((AllTypeContext)_localctx).ast =  new CustomType((((AllTypeContext)_localctx).ID!=null?((AllTypeContext)_localctx).ID.getText():null)); 
				}
				break;
			case T__15:
				{
				setState(141);
				match(T__15);
				setState(142);
				match(T__5);
				setState(143);
				((AllTypeContext)_localctx).recordFields = recordFields();
				setState(144);
				match(T__6);
				 ((AllTypeContext)_localctx).ast =  new StructType(((AllTypeContext)_localctx).recordFields.ast); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
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
					setState(149);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(150);
					match(T__13);
					setState(151);
					((AllTypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
					setState(152);
					match(T__14);
					 ((AllTypeContext)_localctx).ast =  new ArrayType(LexerHelper.lexemeToInt((((AllTypeContext)_localctx).INT_CONSTANT!=null?((AllTypeContext)_localctx).INT_CONSTANT.getText():null)), ((AllTypeContext)_localctx).t1.ast); 
					}
					} 
				}
				setState(158);
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
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__15))) != 0)) {
				{
				{
				setState(159);
				((RecordFieldsContext)_localctx).allType = allType(0);
				setState(160);
				((RecordFieldsContext)_localctx).idList = idList();
				setState(161);
				match(T__1);
				 for(String recordName: ((RecordFieldsContext)_localctx).idList.ast) 
												_localctx.ast.add(new RecordField((((RecordFieldsContext)_localctx).allType!=null?(((RecordFieldsContext)_localctx).allType.start):null).getLine(), (((RecordFieldsContext)_localctx).allType!=null?(((RecordFieldsContext)_localctx).allType.start):null).getCharPositionInLine()+1, recordName, ((RecordFieldsContext)_localctx).allType.ast)); 
											
				}
				}
				setState(168);
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
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__36) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(169);
				((StatementsContext)_localctx).statement = statement();
				setState(170);
				match(T__1);
				 _localctx.ast.addAll(((StatementsContext)_localctx).statement.ast); 
				}
				}
				setState(177);
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
		public List<Statement> ast = new ArrayList<Statement>();
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
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				((StatementContext)_localctx).e1 = expression(0);
				setState(179);
				match(T__16);
				setState(180);
				((StatementContext)_localctx).e2 = expression(0);
				 _localctx.ast.add(new Assignment((((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getLine(), (((StatementContext)_localctx).e1!=null?(((StatementContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(T__17);
				setState(184);
				((StatementContext)_localctx).e1 = ((StatementContext)_localctx).expression = expression(0);
				 _localctx.ast.add(new Return((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(), (((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				match(T__18);
				setState(188);
				((StatementContext)_localctx).expressionList = expressionList();
				 for(Expression expression: ((StatementContext)_localctx).expressionList.ast) 
																	_localctx.ast.add(new Read((((StatementContext)_localctx).expressionList!=null?(((StatementContext)_localctx).expressionList.start):null).getLine(), (((StatementContext)_localctx).expressionList!=null?(((StatementContext)_localctx).expressionList.start):null).getCharPositionInLine()+1, expression)); 
															
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(T__19);
				setState(192);
				((StatementContext)_localctx).expressionList = expressionList();
				 for(Expression expression: ((StatementContext)_localctx).expressionList.ast) 
																	_localctx.ast.add(new Write((((StatementContext)_localctx).expressionList!=null?(((StatementContext)_localctx).expressionList.start):null).getLine(), (((StatementContext)_localctx).expressionList!=null?(((StatementContext)_localctx).expressionList.start):null).getCharPositionInLine()+1, expression)); 
															
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				match(T__20);
				setState(196);
				((StatementContext)_localctx).expression = expression(0);
				setState(197);
				((StatementContext)_localctx).statementBlock = statementBlock();
				 _localctx.ast.add(new While((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(), (((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).statementBlock.ast)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				match(T__21);
				setState(201);
				((StatementContext)_localctx).expression = expression(0);
				setState(202);
				((StatementContext)_localctx).statementBlock = statementBlock();
				 _localctx.ast.add(new IfElse((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(), (((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).statementBlock.ast, new ArrayList<Statement>())); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(205);
				match(T__21);
				setState(206);
				((StatementContext)_localctx).expression = expression(0);
				setState(207);
				((StatementContext)_localctx).s1 = statementBlock();
				setState(208);
				match(T__22);
				setState(209);
				((StatementContext)_localctx).s2 = statementBlock();
				 _localctx.ast.add(new IfElse((((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getLine(), (((StatementContext)_localctx).expression!=null?(((StatementContext)_localctx).expression.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).s1.ast, ((StatementContext)_localctx).s2.ast)); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(212);
				((StatementContext)_localctx).ID = match(ID);
				setState(213);
				match(T__3);
				setState(214);
				((StatementContext)_localctx).expressionList = expressionList();
				setState(215);
				match(T__4);
				 _localctx.ast.add(new FuncInvocation(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine()+1, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), ((StatementContext)_localctx).expressionList.ast)); 
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
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(T__5);
				setState(221);
				((StatementBlockContext)_localctx).statements = statements();
				setState(222);
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
				setState(225);
				((StatementBlockContext)_localctx).statement = statement();
				 _localctx.ast.addAll(((StatementBlockContext)_localctx).statement.ast); 
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
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__23) | (1L << T__36) | (1L << ID) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(230);
				((ExpressionListContext)_localctx).expression = expression(0);
				 _localctx.ast.add(((ExpressionListContext)_localctx).expression.ast); 
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(232);
					match(T__2);
					setState(233);
					((ExpressionListContext)_localctx).expression = expression(0);
					 _localctx.ast.add(((ExpressionListContext)_localctx).expression.ast); 
					}
					}
					setState(240);
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
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(244);
				match(T__3);
				setState(245);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(246);
				match(T__4);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast; 
				}
				break;
			case 2:
				{
				setState(249);
				match(T__23);
				setState(250);
				((ExpressionContext)_localctx).e1 = expression(13);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			case 3:
				{
				setState(253);
				match(T__36);
				setState(254);
				((ExpressionContext)_localctx).e1 = expression(8);
				 ((ExpressionContext)_localctx).ast =  new UnaryNot((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			case 4:
				{
				setState(257);
				match(T__3);
				setState(258);
				((ExpressionContext)_localctx).type = type();
				setState(259);
				match(T__4);
				setState(260);
				((ExpressionContext)_localctx).e1 = expression(6);
				 ((ExpressionContext)_localctx).ast =  new Cast((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).type.ast, ((ExpressionContext)_localctx).e1.ast); 
				}
				break;
			case 5:
				{
				setState(263);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(264);
				match(T__3);
				setState(265);
				((ExpressionContext)_localctx).expressionList = expressionList();
				setState(266);
				match(T__4);
				 ((ExpressionContext)_localctx).ast =  new FuncInvocation(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).expressionList.ast); 
				}
				break;
			case 6:
				{
				setState(269);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			case 7:
				{
				setState(271);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 8:
				{
				setState(273);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new RealLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 9:
				{
				setState(275);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(310);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(279);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(280);
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
						setState(281);
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
						setState(284);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(285);
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
						setState(286);
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
						setState(289);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(290);
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
						setState(291);
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
						setState(294);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(295);
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
						setState(296);
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
						setState(299);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(300);
						match(T__37);
						setState(301);
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
						setState(304);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(305);
						match(T__13);
						setState(306);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(307);
						match(T__14);
						 ((ExpressionContext)_localctx).ast =  new Indexing((((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getLine(), (((ExpressionContext)_localctx).e1!=null?(((ExpressionContext)_localctx).e1.start):null).getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast); 
						}
						break;
					}
					} 
				}
				setState(314);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u013e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\64"+
		"\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5B\n\5\f\5"+
		"\16\5E\13\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7Q\n\7\f\7\16\7"+
		"T\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\ns\n\n\f\n\16\n"+
		"v\13\n\5\nx\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0080\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u0087\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u0096\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u009d\n\r\f\r\16\r\u00a0"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\7\16\u00a7\n\16\f\16\16\16\u00aa\13\16"+
		"\3\17\3\17\3\17\3\17\7\17\u00b0\n\17\f\17\16\17\u00b3\13\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00dd\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e7\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00ef\n\22\f\22\16\22\u00f2\13\22\5\22\u00f4\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u0118\n\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0139\n\23"+
		"\f\23\16\23\u013c\13\23\3\23\2\4\30$\24\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$\2\6\3\2\33\35\4\2\32\32\36\36\3\2\37$\3\2%&\2\u0152\2&\3"+
		"\2\2\2\4\65\3\2\2\2\68\3\2\2\2\bC\3\2\2\2\nF\3\2\2\2\fK\3\2\2\2\16U\3"+
		"\2\2\2\20`\3\2\2\2\22w\3\2\2\2\24\177\3\2\2\2\26\u0086\3\2\2\2\30\u0095"+
		"\3\2\2\2\32\u00a8\3\2\2\2\34\u00b1\3\2\2\2\36\u00dc\3\2\2\2 \u00e6\3\2"+
		"\2\2\"\u00f3\3\2\2\2$\u0117\3\2\2\2&\'\5\4\3\2\'(\5\20\t\2()\b\2\1\2)"+
		"\3\3\2\2\2*+\5\16\b\2+,\b\3\1\2,\64\3\2\2\2-.\5\n\6\2./\b\3\1\2/\64\3"+
		"\2\2\2\60\61\5\6\4\2\61\62\b\3\1\2\62\64\3\2\2\2\63*\3\2\2\2\63-\3\2\2"+
		"\2\63\60\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2"+
		"\2\67\65\3\2\2\289\7\3\2\29:\5\30\r\2:;\7,\2\2;<\7\4\2\2<=\b\4\1\2=\7"+
		"\3\2\2\2>?\5\n\6\2?@\b\5\1\2@B\3\2\2\2A>\3\2\2\2BE\3\2\2\2CA\3\2\2\2C"+
		"D\3\2\2\2D\t\3\2\2\2EC\3\2\2\2FG\5\30\r\2GH\5\f\7\2HI\7\4\2\2IJ\b\6\1"+
		"\2J\13\3\2\2\2KL\7,\2\2LR\b\7\1\2MN\7\5\2\2NO\7,\2\2OQ\b\7\1\2PM\3\2\2"+
		"\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\r\3\2\2\2TR\3\2\2\2UV\5\26\f\2VW\7,"+
		"\2\2WX\7\6\2\2XY\5\22\n\2YZ\7\7\2\2Z[\7\b\2\2[\\\5\b\5\2\\]\5\34\17\2"+
		"]^\7\t\2\2^_\b\b\1\2_\17\3\2\2\2`a\7\n\2\2ab\7\13\2\2bc\7\6\2\2cd\7\7"+
		"\2\2de\7\b\2\2ef\5\b\5\2fg\5\34\17\2gh\7\t\2\2hi\b\t\1\2i\21\3\2\2\2j"+
		"k\5\24\13\2kl\7,\2\2lt\b\n\1\2mn\7\5\2\2no\5\24\13\2op\7,\2\2pq\b\n\1"+
		"\2qs\3\2\2\2rm\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2"+
		"\2wj\3\2\2\2wx\3\2\2\2x\23\3\2\2\2yz\7\f\2\2z\u0080\b\13\1\2{|\7\r\2\2"+
		"|\u0080\b\13\1\2}~\7\16\2\2~\u0080\b\13\1\2\177y\3\2\2\2\177{\3\2\2\2"+
		"\177}\3\2\2\2\u0080\25\3\2\2\2\u0081\u0082\5\24\13\2\u0082\u0083\b\f\1"+
		"\2\u0083\u0087\3\2\2\2\u0084\u0085\7\n\2\2\u0085\u0087\b\f\1\2\u0086\u0081"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0087\27\3\2\2\2\u0088\u0089\b\r\1\2\u0089"+
		"\u008a\5\24\13\2\u008a\u008b\b\r\1\2\u008b\u0096\3\2\2\2\u008c\u008d\7"+
		"\17\2\2\u008d\u008e\7,\2\2\u008e\u0096\b\r\1\2\u008f\u0090\7\22\2\2\u0090"+
		"\u0091\7\b\2\2\u0091\u0092\5\32\16\2\u0092\u0093\7\t\2\2\u0093\u0094\b"+
		"\r\1\2\u0094\u0096\3\2\2\2\u0095\u0088\3\2\2\2\u0095\u008c\3\2\2\2\u0095"+
		"\u008f\3\2\2\2\u0096\u009e\3\2\2\2\u0097\u0098\f\4\2\2\u0098\u0099\7\20"+
		"\2\2\u0099\u009a\7-\2\2\u009a\u009b\7\21\2\2\u009b\u009d\b\r\1\2\u009c"+
		"\u0097\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\31\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\5\30\r\2\u00a2\u00a3"+
		"\5\f\7\2\u00a3\u00a4\7\4\2\2\u00a4\u00a5\b\16\1\2\u00a5\u00a7\3\2\2\2"+
		"\u00a6\u00a1\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\33\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\5\36\20\2\u00ac"+
		"\u00ad\7\4\2\2\u00ad\u00ae\b\17\1\2\u00ae\u00b0\3\2\2\2\u00af\u00ab\3"+
		"\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\35\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\5$\23\2\u00b5\u00b6\7\23\2"+
		"\2\u00b6\u00b7\5$\23\2\u00b7\u00b8\b\20\1\2\u00b8\u00dd\3\2\2\2\u00b9"+
		"\u00ba\7\24\2\2\u00ba\u00bb\5$\23\2\u00bb\u00bc\b\20\1\2\u00bc\u00dd\3"+
		"\2\2\2\u00bd\u00be\7\25\2\2\u00be\u00bf\5\"\22\2\u00bf\u00c0\b\20\1\2"+
		"\u00c0\u00dd\3\2\2\2\u00c1\u00c2\7\26\2\2\u00c2\u00c3\5\"\22\2\u00c3\u00c4"+
		"\b\20\1\2\u00c4\u00dd\3\2\2\2\u00c5\u00c6\7\27\2\2\u00c6\u00c7\5$\23\2"+
		"\u00c7\u00c8\5 \21\2\u00c8\u00c9\b\20\1\2\u00c9\u00dd\3\2\2\2\u00ca\u00cb"+
		"\7\30\2\2\u00cb\u00cc\5$\23\2\u00cc\u00cd\5 \21\2\u00cd\u00ce\b\20\1\2"+
		"\u00ce\u00dd\3\2\2\2\u00cf\u00d0\7\30\2\2\u00d0\u00d1\5$\23\2\u00d1\u00d2"+
		"\5 \21\2\u00d2\u00d3\7\31\2\2\u00d3\u00d4\5 \21\2\u00d4\u00d5\b\20\1\2"+
		"\u00d5\u00dd\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7\u00d8\7\6\2\2\u00d8\u00d9"+
		"\5\"\22\2\u00d9\u00da\7\7\2\2\u00da\u00db\b\20\1\2\u00db\u00dd\3\2\2\2"+
		"\u00dc\u00b4\3\2\2\2\u00dc\u00b9\3\2\2\2\u00dc\u00bd\3\2\2\2\u00dc\u00c1"+
		"\3\2\2\2\u00dc\u00c5\3\2\2\2\u00dc\u00ca\3\2\2\2\u00dc\u00cf\3\2\2\2\u00dc"+
		"\u00d6\3\2\2\2\u00dd\37\3\2\2\2\u00de\u00df\7\b\2\2\u00df\u00e0\5\34\17"+
		"\2\u00e0\u00e1\7\t\2\2\u00e1\u00e2\b\21\1\2\u00e2\u00e7\3\2\2\2\u00e3"+
		"\u00e4\5\36\20\2\u00e4\u00e5\b\21\1\2\u00e5\u00e7\3\2\2\2\u00e6\u00de"+
		"\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7!\3\2\2\2\u00e8\u00e9\5$\23\2\u00e9"+
		"\u00f0\b\22\1\2\u00ea\u00eb\7\5\2\2\u00eb\u00ec\5$\23\2\u00ec\u00ed\b"+
		"\22\1\2\u00ed\u00ef\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f3\u00e8\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4#\3\2\2\2\u00f5\u00f6"+
		"\b\23\1\2\u00f6\u00f7\7\6\2\2\u00f7\u00f8\5$\23\2\u00f8\u00f9\7\7\2\2"+
		"\u00f9\u00fa\b\23\1\2\u00fa\u0118\3\2\2\2\u00fb\u00fc\7\32\2\2\u00fc\u00fd"+
		"\5$\23\17\u00fd\u00fe\b\23\1\2\u00fe\u0118\3\2\2\2\u00ff\u0100\7\'\2\2"+
		"\u0100\u0101\5$\23\n\u0101\u0102\b\23\1\2\u0102\u0118\3\2\2\2\u0103\u0104"+
		"\7\6\2\2\u0104\u0105\5\24\13\2\u0105\u0106\7\7\2\2\u0106\u0107\5$\23\b"+
		"\u0107\u0108\b\23\1\2\u0108\u0118\3\2\2\2\u0109\u010a\7,\2\2\u010a\u010b"+
		"\7\6\2\2\u010b\u010c\5\"\22\2\u010c\u010d\7\7\2\2\u010d\u010e\b\23\1\2"+
		"\u010e\u0118\3\2\2\2\u010f\u0110\7,\2\2\u0110\u0118\b\23\1\2\u0111\u0112"+
		"\7-\2\2\u0112\u0118\b\23\1\2\u0113\u0114\7.\2\2\u0114\u0118\b\23\1\2\u0115"+
		"\u0116\7/\2\2\u0116\u0118\b\23\1\2\u0117\u00f5\3\2\2\2\u0117\u00fb\3\2"+
		"\2\2\u0117\u00ff\3\2\2\2\u0117\u0103\3\2\2\2\u0117\u0109\3\2\2\2\u0117"+
		"\u010f\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0113\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0118\u013a\3\2\2\2\u0119\u011a\f\16\2\2\u011a\u011b\t\2\2\2\u011b"+
		"\u011c\5$\23\17\u011c\u011d\b\23\1\2\u011d\u0139\3\2\2\2\u011e\u011f\f"+
		"\r\2\2\u011f\u0120\t\3\2\2\u0120\u0121\5$\23\16\u0121\u0122\b\23\1\2\u0122"+
		"\u0139\3\2\2\2\u0123\u0124\f\f\2\2\u0124\u0125\t\4\2\2\u0125\u0126\5$"+
		"\23\r\u0126\u0127\b\23\1\2\u0127\u0139\3\2\2\2\u0128\u0129\f\13\2\2\u0129"+
		"\u012a\t\5\2\2\u012a\u012b\5$\23\f\u012b\u012c\b\23\1\2\u012c\u0139\3"+
		"\2\2\2\u012d\u012e\f\t\2\2\u012e\u012f\7(\2\2\u012f\u0130\5$\23\n\u0130"+
		"\u0131\b\23\1\2\u0131\u0139\3\2\2\2\u0132\u0133\f\20\2\2\u0133\u0134\7"+
		"\20\2\2\u0134\u0135\5$\23\2\u0135\u0136\7\21\2\2\u0136\u0137\b\23\1\2"+
		"\u0137\u0139\3\2\2\2\u0138\u0119\3\2\2\2\u0138\u011e\3\2\2\2\u0138\u0123"+
		"\3\2\2\2\u0138\u0128\3\2\2\2\u0138\u012d\3\2\2\2\u0138\u0132\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b%\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\25\63\65CRtw\177\u0086\u0095\u009e\u00a8\u00b1\u00dc"+
		"\u00e6\u00f0\u00f3\u0117\u0138\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}