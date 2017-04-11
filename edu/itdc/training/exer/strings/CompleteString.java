package edu.itdc.training.exer.strings;

/**
 * A string is said to be complete if it contains all the 
 * characters from a to z. Given a string, write a method 
 * to check if it is complete or not.
 * 
 * @author Java4Flip
 *
 */
public class CompleteString {
	public static void main(String[] args) {
		
		String string = "The quick brown fox jumps over the lazy dog near the bank of the river.";
		if(isStringComplete(string)) {
			System.out.println("Complete String");
		} else {
			System.out.println("Incomplete String");
		}
		
	}
	
	public static boolean isStringComplete(String str) {
		String completeString = "abcdefghijklmnopqrstuvwxyz";
		String tempStr = str.toLowerCase();
		
		boolean isComplete = true;
		for( int i = 0; i < completeString.length(); i++ ) {
			if( tempStr.indexOf((int) completeString.charAt(i)) == -1 ) {
				isComplete = false;
				break;
			}
		}
		return isComplete;
	}
}
