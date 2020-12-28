/*
 * LOGOS It Academy Homework Lesson 9
 * 
 * */
package ua.lviv.logos;

/**
 * @authorVadim_Khodorovskyi
 * @see WrongInputConsoleParametersException
 * */
public class WrongInputConsoleParametersException extends Exception {
	
	/*name of class*/
	String error;

	/**
	 * @exception WrongInputConsoleParametersException 
	 * */
	public WrongInputConsoleParametersException(String error) {
		super(error);
		this.error = error;
	}

	public String getError() {
		return error;
	}

}
