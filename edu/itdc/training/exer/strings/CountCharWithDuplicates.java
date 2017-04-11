package edu.itdc.training.exer.strings;

/**
 * Write a program that will accept any String and print 
 * all the characters that have duplicates and display their count.
 * 
 * @author Java4Flip
 *
 */
public class CountCharWithDuplicates {
	public static void main(String[] args) {
		String str = "To see is to believe again and again";
		
		int charArray[][] = countCharWithDuplicates(str);
		for( int i = 0; i < charArray.length; i++ ) {
			System.out.println((char) charArray[i][0] + ": " + charArray[i][1]);
		}
		
	}

	/**
	 * Count the number of characters with duplicates and returns 
	 * an array with the character with duplicates and their count.
	 * 
	 * @param  str     the string 
	 * @return int[][] 2 dimensional int array. 1 - the char as int, 
	 *                                          2 - number of occurrences   
	 */
	private static int[][] countCharWithDuplicates(String str) {
		int ascii[] = new int[128];
		for( int i = 0; i < str.length(); i++ ) {
			ascii[Character.toLowerCase(str.charAt(i))]++;
		}
		
		int occurrence = 0;
		for(int i = 0; i < ascii.length; i++ ) {
			if( ascii[i] > 1 && Character.isLetter(i)) {
				occurrence++;
			}
		}
		
		int withDuplicates[][] = new int[occurrence][2];
		int counter = 0;
		for(int i = 0; i < ascii.length; i++ ) {
			if( ascii[i] > 1 && Character.isLetter(i)) {
				withDuplicates[counter][0] = i;
				withDuplicates[counter][1] = ascii[i];
				counter++;
			}
		}
		return withDuplicates;
	}
}
