package edu.sussex.coms223.lab6;

/**
 * This class implements a checked exception that is thrown when an arithmetic
 * expression is determined to be incorrectly structured.
 * 
 * @author Sesh Venugopal
 * 
 */
@SuppressWarnings("serial")
public class IllegalExpressionException extends Exception {

	/**
	 * Initializes a new exception instance with no detailed message.
	 */
	public IllegalExpressionException() {
		super();
	}

	/**
	 * Initializes a new exception instance with a given detailed message.
	 * 
	 * @param s Detailed message.
	 */
	public IllegalExpressionException(String s) {
		super(s);
	}
}
