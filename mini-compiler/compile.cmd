@echo off
REM This Windows script generates the lexer and parser implementation of the compiler
REM Uses ANTLR 4
REM Generates CmmLexer.java, CmmParser.java and LexerHelper.java

java -jar antlr-4.7-complete.jar src/parser/Cmm.g4 -package parser -no-listener -o src/parser
