import org.antlr.v4.runtime.*;

import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import parser.*;
import semantic.IdentificationVisitor;
import semantic.TypeCheckingVisitor;
import ast.Program;
import codegeneration.OffsetVisitor;
import errorhandler.ErrorHandler;


public class MainIntrospector {
	
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
		Program ast = parser.program().ast;
		
		if (parser.getNumberOfSyntaxErrors() >0) {
			System.err.println("Program with syntax errors. No code was generated.");
			return;
		}
		
		ast.accept(new IdentificationVisitor(), null);
		ast.accept(new TypeCheckingVisitor(), null);

		
		if (ErrorHandler.getErrorHandler().anyError()) {
			ErrorHandler.getErrorHandler().showErrors(System.err);
			System.err.println("Program with semantic errors. No code was generated.");
		}
		
		ast.accept(new OffsetVisitor(), null);
		
	
		// * The AST is shown
		IntrospectorModel model=new IntrospectorModel("Program", ast);
		new IntrospectorTree("Introspector", model);		
	}
	

}
