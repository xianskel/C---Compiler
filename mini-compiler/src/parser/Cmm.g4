/**
  * Parser and lexer specification file with ANTLR for a subset of the C-- (Cmm) langauge.
  * 
  * @author  Francisco Ortin
  */

grammar Cmm;	

@header {
	import ast.*;
	import types.*;
}

/************************** Parser rules *************************/

program returns [Program ast]: 
		varDefinitions 'void' m='main' '(' ')' '{'  statements '}'
			{ $ast = new Program($varDefinitions.start.getLine(), $varDefinitions.start.getCharPositionInLine()+1,
                                 $varDefinitions.ast, $statements.ast); } 
        ;
varDefinitions returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]:
         ( type ID ';'    { $ast.add(new VarDefinition($ID.getLine(), $ID.getCharPositionInLine()+1, 
                                  $ID.text, $type.ast)); }
         )*
         ;
type returns [Type ast]: 
      'int' 						{ $ast = IntType.getInstance(); }				
    | 'double'						{ $ast = RealType.getInstance(); } 
    ;
statements returns [List<Statement> ast = new ArrayList<Statement>()]:
         ( statement ';'       { $ast.add($statement.ast); }
         )*
         ;
statement returns [Statement ast]:
           'write' expression 	    { $ast = new Write($expression.start.getLine(),
                                                   $expression.start.getCharPositionInLine()+1, $expression.ast); }
        |  e1=expression '=' e2=expression  { $ast = new Assignment($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $e2.ast); }
         ;
expression returns [Expression ast]: 
           ID                                 { $ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text); } 						                        
         | INT_CONSTANT 			          { $ast = new IntLiteral($INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToInt($INT_CONSTANT.text)); }
         | REAL_CONSTANT 			          { $ast = new RealLiteral($REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal($REAL_CONSTANT.text)); }
         | '(' e1=expression ')'              { $ast = $e1.ast; }
		 | e1=expression op=('*'|'/'|'%') 
		   e2=expression                      { $ast = new Arithmetic($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $op.text, $e2.ast); }
		 | e1=expression op=('+'|'-') 
		   e2=expression                      { $ast = new Arithmetic($e1.start.getLine(), $e1.start.getCharPositionInLine()+1, $e1.ast, $op.text, $e2.ast); }
         ;
  		 
/************************** Lexer rules *************************/
  		 
WS: [ \t\r\n]+ -> skip 
	;
COMMENT: '//' .*? ('\n'|'\r'|EOF)  -> skip
	   ; 
INT_CONSTANT: [0-9]+ 
           ;
REAL_CONSTANT: INT_CONSTANT '.' [0-9]+
             ;
ID: [a-zA-Z]+           
  ;

