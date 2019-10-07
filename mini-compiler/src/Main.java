/**
 * Example mini compiler for a Programming Language Design and Implementation course.
 * Entry point of the compiler, showing no debug information.
 * 
 * @author  Francisco Ortin
 */

import parser.*;
import semantic.*;

import org.antlr.v4.runtime.*;

import ast.Program;
import codegeneration.*;
import errorhandler.ErrorHandler;

public class Main {
	
	public static void main(String... args) throws Exception {
		   if (args.length<2) {
		        System.err.println("Please, pass me the input and output file names.");
		        return;
		    }
		   		 			
		 // * Creates one lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		CmmLexer lexer = new CmmLexer(input);

		// * Creates one parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		CmmParser parser = new CmmParser(tokens);	
		Program ast = parser.program().ast;

		if (parser.getNumberOfSyntaxErrors() >0) {
			System.err.println("Program with syntax errors. No code was generated.");
			return;
		}
		
		// * The AST is traversed
		ast.accept(new IdentificationVisitor(),null);
		ast.accept(new TypeCheckingVisitor(),null);
		
		if (ErrorHandler.getErrorHandler().anyError()) {
			ErrorHandler.getErrorHandler().showErrors(System.err);
			System.err.println("Program with semantic errors. No code was generated.");
		}
		else {
			ast.accept(new OffsetVisitor(), null);
			ast.accept(new ExecuteCGVisitor(new CG(args[1], args[0])), null);
		}
	
	}
	

}
