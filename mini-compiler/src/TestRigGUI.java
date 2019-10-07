/**
 * Invokes the ANTLR TesRig tool to show the parse tree of the input program.
 * 
 * @author  Francisco Ortin
 */


public class TestRigGUI {
	
	public static void main(String... args) throws Exception {
		org.antlr.v4.gui.TestRig.main(new String[]{"parser.Cmm", "program", "-gui", "input.txt"});
	}
	

}
