package edu.itdc.training.exer.fundamentals;

/**
 * A number is special if it is a multiple of 11 or if it is one 
 * more than a multiple of 11. Print “special” if the given 
 * non-negative number is special or “not special” if otherwise.
 * Use the % "mod" operator and the ternary conditional operator only.
 * 
 * @author Java4Flip
 *
 */
public class SpecialNumber {

	public static void main(String[] args) {
		int multipleOf = 11;
		
		int number = 22;	
		System.out.println(isSpecial(multipleOf, number));
		
		number = 23;
		System.out.println(isSpecial(multipleOf, number));
		
		number = 24;
		System.out.println(isSpecial(multipleOf, number));
	}

	/**
	 * Check if a number is a multiple of another number or one more
	 * 
	 * @param multipleOf  
	 * @param number      
	 *  
	 * @return String   return SPECIAL is number is a multiple and 
	 *                  NOT SPECIAL if otherwise
 	 */
	private static String isSpecial(int multipleOf, int number) {
		return number % multipleOf <= 1 ? "SPECIAL": "NOT SPECIAL";
	}
	
}
