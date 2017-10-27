/*
* File: Variables.java
* Author: Yael Brown
* Date: October 27, 2017
* Purpose: Notes on Java Variables 
*/

public class Variables {
	// Instance Variables, fields declared without static. Unique to each instance of the class. 
	int aa = 0;
	int ab = 0;
	int ac = 0;
	
	// Class variable is any field declared with the static modifier. 
	static int ad = 0;
	static int ae = 0;
	static int af = 0;
	
	// Local variables are only visible to the methods in which they are declared. 
	public static void ba() { 
		@SuppressWarnings("unused")
		int ag = 0;// local variable
	}
	
	/*
	 * Variable names are case-sensitive:
	 * 		variableNames = lower camel case
	 * 		ClassNames = upper camel case
	 * 		CONSTANTS = upper case 
	 */
	
	/*
	 * Primitive Data Types (8):
	 * 		Java is statically-typed. Must variables must be declared before they can be used.
	 * 
	 *  		byte - 8-bit integer. (min: -128, max: 127 (inclusive))
	 *  			Useful for saving memory in large arrays. 
	 *  		
	 *  		short - 16-bit integer. (min: -32768, max: 32767 (inclusive))
	 *  			Can save memory in large arrays. 
	 *  		
	 *  		int - 32-bit integer. (min: -2^31, max: 2^31-1)
	 *  			
	 *  		long -   
	 *  
	 *  		float - 
	 *  
	 *  		double - 
	 *  
	 *  		boolean -
	 *  
	 *  		char -
	 */
}
