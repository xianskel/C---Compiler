/**
 * Invokes the ANTLR TesRig tool to show the tokens in the input program.
 * 
 * @author  Francisco Ortin
 */

public class TestRigTokens {
	
	public static void main(String... args) throws Exception {
		org.antlr.v4.gui.TestRig.main(new String[]{"parser.Cmm", "program", "-tokens", "input.txt"});
	}
	

}
