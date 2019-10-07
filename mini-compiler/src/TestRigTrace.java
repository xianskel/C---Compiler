/**
 * Invokes the ANTLR TesRig tool to trace how the parser analyzes the input program.
 * 
 * @author  Francisco Ortin
 */

public class TestRigTrace {
	
	public static void main(String... args) throws Exception {
		org.antlr.v4.gui.TestRig.main(new String[]{"parser.Cmm", "program", "-trace", "input.txt"});
	}
	

}
