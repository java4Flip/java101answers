package edu.itdc.training.exer.strings;

import java.util.Arrays;

/**
 * Write a method that will return the most occurred character 
 * from a String. If there are two or more characters with 
 * the same number of occurrence, return both character. 
 * You can use an array of char for your return value.
 * 
 * @author Java4Flip
 *
 */
public class MostNumberOfOccurrence {
	public static void main(String[] args) {
		String str = "xxxxffffcvvvbnbbbbbbbbbdbxxxxxxedsdgggg";
		
		char[] mostOccurring = mostOccurringChar(str); 
		System.out.println(Arrays.toString(mostOccurring));
		
		str = "ccccfffcctttttt";
		mostOccurring = mostOccurringChar(str); 
		System.out.println(Arrays.toString(mostOccurring));
		
	}

	private static char[] mostOccurringChar(String str) {
		int ascii[]  = new int[128];
		int maxCount = 0;
		for( int i = 0; i < str.length(); i++ ) {
			// assuming to count only letters and digits
			if(Character.isLetterOrDigit(str.charAt(i))) {  
				ascii[str.charAt(i)]++;
				if( ascii[str.charAt(i)] > maxCount ) {
					maxCount = ascii[str.charAt(i)]; 
				}
			}
		}

		String mostOccurring = "";
		for( int i = 0; i < ascii.length; i++ ) {
			if( ascii[i] == maxCount ) {
				mostOccurring += (char) i;
			}
		}
		return mostOccurring.trim().toCharArray();
	}
}
