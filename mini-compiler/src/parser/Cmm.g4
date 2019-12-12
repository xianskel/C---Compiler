grammar Cmm;

@header {
	import ast.*;
	import types.*;
}

/************************** Parser rules *************************/

program returns [Program ast]: 
	definitions mainDefinition
		{ 
			$definitions.ast.add($mainDefinition.ast);
			$ast = new Program($definitions.start.getLine(), $definitions.start.getCharPositionInLine()+1, $definitions.ast); 
	    } 
	;      

definitions returns [List<Definition> ast = new ArrayList<Definition>()]:
	(  funcDefinition	   { $ast.add($funcDefinition.ast); }
	 | varDefinition       { $ast.addAll($varDefinition.ast); }
	 | typeDefinition      { $ast.add($typeDefinition.ast); }
	)*
	;
		
typeDefinition returns [TypeDefinition ast]:
	  'typedef' allType ID ';'     { $ast = new TypeDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text, $allType.ast); }
	;
			   
varDefinitions returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]:
	(varDefinition  { $ast.addAll($varDefinition.ast); })* 	
	;
  
varDefinition returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]:
	allType idList 	';'		{ for(String varName: $idList.ast) 
													$ast.add(new VarDefinition($idList.start.getLine(), $idList.start.getCharPositionInLine()+1, varName, $allType.ast)); 
												}
	;

idList returns [List<String> ast = new ArrayList<String>()]:
	ID { $ast.add($ID.text); } 
	(',' ID { $ast.add($ID.text); } )* 
	;	

funcDefinition returns [FuncDefinition ast]:
	returnType id1=ID '(' typedIdList ')' '{' varDefinitions statements '}'	
		{ 
			FuncType type = new FuncType($returnType.ast, $typedIdList.ast);
			$ast = new FuncDefinition($id1.getLine(), $id1.getCharPositionInLine()+1, 
						$id1.text, type, $varDefinitions.ast, $statements.ast); 
		}
    ;
    
mainDefinition returns [FuncDefinition ast]:
	'void' 'main' '(' ')' '{' varDefinitions statements '}'
		{ 
			FuncType type = new FuncType(VoidType.getInstance(), new ArrayList());
			$ast = new FuncDefinition($varDefinitions.start.getLine(), $varDefinitions.start.getCharPositionInLine()+1, 
						"main" ,type, $varDefinitions.ast, $statements.ast); 
		}
    ;    

typedIdList returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]:
	(type ID { $ast.add(new VarDefinition($type.start.getLine(), $type.start.getCharPositionInLine()+1, $ID.text, $type.ast)); }
	(',' type ID { $ast.add(new VarDefinition($type.start.getLine(), $type.start.getCharPositionInLine()+1, $ID.text, $type.ast)); } )*)?
	;    
	
type returns [Type ast]:
	  'int' 		{ $ast = IntType.getInstance(); }				
    | 'double'		{ $ast = RealType.getInstance(); }
    | 'char'		{ $ast = CharType.getInstance(); }
    ;
			   	   
returnType returns [Type ast]:
	   type			{ $ast = $type.ast; }
    | 'void'		{ $ast = VoidType.getInstance(); }
    ;
     					
allType returns [Type ast]:
	  type								   { $ast = $type.ast; }				
    | 'type' ID     					   { $ast = new CustomType($ID.text); }
    | t1=allType '['INT_CONSTANT']' 	   { $ast = new ArrayType(LexerHelper.lexemeToInt($INT_CONSTANT.text), $t1.ast); }
    | 'struct' '{' recordFields '}'        { $ast = new StructType($recordFields.ast); }
    ;
    
recordFields returns [List<RecordField> ast = new ArrayList<RecordField>()]:
	(allType idList ';'		{ for(String recordName: $idList.ast) 
								$ast.add(new RecordField($allType.start.getLine(), $allType.start.getCharPositionInLine()+1, recordName, $allType.ast)); 
							}
	)*
	;

statements returns [List<Statement> ast = new ArrayList<Statement>()]:
	(statement ';' { $ast.addAll($statement.ast); })*
	;
		  	
statement returns [List<Statement> ast = new ArrayList<Statement>()]: 
	  e1=expression '=' e2=expression  		{ $ast.add(new Assignment($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast)); }
	| 'return' e1=expression				{ $ast.add(new Return($expression.start.getLine(), $expression.start.getCharPositionInLine()+1, $expression.ast)); }
	| 'read'  expressionList				{ for(Expression expression: $expressionList.ast) 
													$ast.add(new Read($expressionList.start.getLine(), $expressionList.start.getCharPositionInLine()+1, expression)); 
											}
	| 'write' expressionList				{ for(Expression expression: $expressionList.ast) 
													$ast.add(new Write($expressionList.start.getLine(), $expressionList.start.getCharPositionInLine()+1, expression)); 
											}
	| 'while' expression statementBlock		{ $ast.add(new While($expression.start.getLine(), $expression.start.getCharPositionInLine()+1, $expression.ast, $statementBlock.ast)); }
	| 'if' expression statementBlock        { $ast.add(new IfElse($expression.start.getLine(), $expression.start.getCharPositionInLine()+1, $expression.ast, $statementBlock.ast, new ArrayList<Statement>())); }
	| 'if' expression s1=statementBlock 
	  'else' s2=statementBlock				{ $ast.add(new IfElse($expression.start.getLine(), $expression.start.getCharPositionInLine()+1, $expression.ast, $s1.ast, $s2.ast)); }
	| ID '(' expressionList ')' 			{ $ast.add(new FuncInvocation($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text, $expressionList.ast)); }
;
		 
statementBlock returns [List<Statement> ast = new ArrayList<Statement>()]:
	'{' statements '}' { $ast = $statements.ast; }
	| statement { $ast.addAll($statement.ast); }
	;
	
expressionList returns [List<Expression> ast = new ArrayList<Expression>()]:
	( expression { $ast.add($expression.ast); } 
	  (',' expression { $ast.add($expression.ast); } )* 
	)?  
	;	 			  		 
 		
expression returns [Expression ast]: 
	'(' e1=expression ')'						{ $ast = $e1.ast; }
	| e1=expression '[' e2=expression ']'		{ $ast = new Indexing($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
	| '-' e1=expression							{ $ast = new UnaryMinus($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast); }
	| e1=expression op=('*'|'/'|'%') 
	  e2=expression  							{ $ast = new Arithmetic($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $op.text, $e2.ast); }
	| e1=expression op=('+'|'-') 
	  e2=expression								{ $ast = new Arithmetic($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $op.text, $e2.ast); }
	| e1=expression op=('>'|'>='|'<'|'<='|'!='|'==') 
	  e2=expression								{ $ast = new Comparison($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $op.text, $e2.ast); }
	| e1=expression op=('&&'|'||') 
	  e2=expression								{ $ast = new Logical($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $op.text, $e2.ast); }
	| '!' e1=expression							{ $ast = new UnaryNot($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast); }
	| e1=expression '.' e2=expression			{ $ast = new DotNotation($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
	| '(' type ')' e1=expression				{ $ast = new Cast($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $type.ast, $e1.ast); }
	| ID '(' expressionList ')' 				{ $ast = new FuncInvocation($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text, $expressionList.ast); }
	| ID 										{ $ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text); } 
	| INT_CONSTANT								{ $ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt($INT_CONSTANT.text)); }
	| REAL_CONSTANT								{ $ast = new RealLiteral($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal($REAL_CONSTANT.text)); }
	| CHAR_CONSTANT								{ $ast = new CharLiteral($CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text)); }
	; 
            
       
/************************** Lexer rules *************************/

fragment
DIGIT: [0-9]
	 ;
	 
fragment
MANTISSA: ('e'|'E') 
		;
		
fragment
EXPONENT: ('+'|'-')? DIGIT+
		;			 
       
WS: [ \t\r\n]+ -> skip 
  ;      
  
SINGLE_LINE_COMMENT: '//' .*? ('\n'|'\r'|EOF)  -> skip
	   			   ;
	   			   
MULTI_LINE_COMMENT: '/*' .*? '*/'  -> skip	   
	   			  ;	   	
			  
ID: [a-zA-Z] 
  | [a-zA-Z_][a-zA-Z_0-9]+
  ;	   
  		 
INT_CONSTANT: '0' | [1-9] DIGIT*            
			;
            
REAL_CONSTANT: (INT_CONSTANT? '.' DIGIT+ MANTISSA EXPONENT) 
			 | (INT_CONSTANT MANTISSA EXPONENT)
			 | (INT_CONSTANT? '.' DIGIT*)
			 ;              
            
CHAR_CONSTANT: '\'' (.|'\\n'|'\\t'|[\\0-9]+) '\''
             ;
			
	 