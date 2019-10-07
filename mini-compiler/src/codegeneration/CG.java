/**
  * Helper class to generate assembly MAPL target code.
  * 
  * @author  Francisco Ortin
  */

package codegeneration;

import java.io.*;

import ast.*;
import types.*;

public class CG {

	/**
	 * The output file
	 */
	private PrintWriter out;

	public CG(String outputFilename, String sourceFilename) {
	    try {
	        this.out=new PrintWriter(outputFilename);
	    }
	    catch (IOException e) {
	        System.err.println("Error oppening the file "+outputFilename+".");
	        System.exit(-1);
	    }
	    this.source(sourceFilename);
	}
	
	public void output(Type type) {
		out.println("\tout"+type.suffix());	    
		out.flush();
	}
	
	public void pusha(int offset) {
		out.println("\tpusha\t"+offset+"");
		out.flush();
	}
	
	public void load(Type type) {
		out.println("\tload"+type.suffix());
		out.flush();
	}
	
	public void store(Type type) {
		out.println("\tstore"+type.suffix());
		out.flush();
	}
	
	public void add(Type type) {
		out.println("\tadd"+type.suffix());
		out.flush();
	}
	
	public void sub(Type type) {
		out.println("\tsub"+type.suffix());
		out.flush();
	}
	
	
	public void mul(Type type) {
		out.println("\tmul"+type.suffix());
		out.flush();
	}
	
	public void div(Type type) {
		out.println("\tdiv"+type.suffix());
		out.flush();
	}
	
	public void mod(Type type) {
		out.println("\tmod"+type.suffix());
		out.flush();
	}
	
	public void push(int constant) {
		out.println("\tpushi\t"+constant+"");
		out.flush();
	}
	
	public void push(double constant) {
		out.println("\tpushf\t"+constant+"");
		out.flush();
	}
	
	
	public void newLine() {
		out.println();	    	    
		out.flush();
	}
	public void comment(String message) {
		out.println("\t' * "+message+"");	    	    
		out.flush();
	}
	
	/**
	 * Variable definition generates one comment for readability purposes
	 */
	public void declaration(VarDefinition varDefinition) {
		comment(varDefinition.getType().toString()+" "+varDefinition.getName()+" (offset "+varDefinition.getOffset()+")");
		out.flush();
	}
	
	
	/**
	 * Pushes the address of a local or global variable
	 */
	public void pushAddress(Variable variable) {
		VarDefinition varDefinition = variable.getDefinition();
		pusha(varDefinition.getOffset());
	}

	// * To generate debug information
	
	public void line(ASTNode nodo) {
		out.println("\n#line\t"+nodo.getLine());
		out.flush();
	}

	private void source(String infilename) {
		out.println("\n#source\t\""+infilename+"\"\n");
		out.flush();		
	}

	public void arithmetic(String operator, Type type) {
		switch (operator.charAt(0)) {
		case '+': this.add(type); break;
		case '-': this.sub(type); break;
		case '/': this.div(type); break;
		case '*': this.mul(type); break;
		case '%': this.mod(type); break;
		default: assert false :"Unknown arithmetic operator";
		}
	}

	
}
