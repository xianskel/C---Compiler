/**
  * Error handler for semantic errors. 
  * All the semantic errors are represented as a new kind of Type: ErrorType.
  * Assigning ErrorType as the type of one expression means that it is erroneous. 
  * In this way, erroneous and correct expressions are treated uniformly.
  * 
  * @author  Francisco Ortin
  */

package errorhandler;

import java.io.PrintStream;
import java.util.*;

import types.ErrorType;

public class ErrorHandler {

	/**
	 * Singleton: private default constructor
	 */
	private ErrorHandler()  {}
	
	/**
	 * Singleton: unique static instance
	 */
	private static ErrorHandler instance=new ErrorHandler();
	
	
	/** 
	 * @return Singleton: the unique class instance
	 */
	public static ErrorHandler getErrorHandler() { return instance; }

	
	private List<ErrorType> errors=new ArrayList<ErrorType>();
	
	public void addError(types.ErrorType error) {
		errors.add(error);
	}
	
	public void showErrors(PrintStream out) {
		for (int i=0;i<errors.size();i++)
			out.println(errors.get(i));
	}
	
	public boolean anyError() {
		return errors.size()>0;
	}
	
}
