import org.antlr.v4.runtime.*;

import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import parser.*;
import ast.Program;


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
		
	
		// * The AST is shown
		IntrospectorModel model=new IntrospectorModel("Program", ast);
		new IntrospectorTree("Introspector", model);		
	}
	

}
