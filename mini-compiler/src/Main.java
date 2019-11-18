import parser.*;
import semantic.TypeCheckingVisitor;

import org.antlr.v4.runtime.*;

import ast.Program;
import errorhandler.ErrorHandler;

public class Main {
	
	public static void main(String... args) throws Exception {
		   if (args.length<1) {
		        System.err.println("Please, pass me the input file.");
		        return;
		    }
		   		 			
		 // create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		CmmLexer lexer = new CmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		CmmParser parser = new CmmParser(tokens);	
		parser.program();
		Program ast = parser.program().ast;
		
		ast.accept(new TypeCheckingVisitor(),null);
		
		if (ErrorHandler.getErrorHandler().anyError()) {
			ErrorHandler.getErrorHandler().showErrors(System.err);
			System.err.println("Program with semantic errors. No code was generated.");
		}
	}
	

}
