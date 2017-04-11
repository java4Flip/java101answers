package edu.itdc.training.exer.arrays;

/**
 * Write a program that will print get an integer from 1 to
 * 19 from the user and print the equivalent in words. Use
 * arrays to solve this program.
 * 
 *  @author Java4Flip  Java para sa mga Filipino
 * 
 */
public class NumberInWords {
	public static void main(String[] args) {
		int number = -1;
		
		String inWord = numberInWord(number);
		System.out.println("Number: " + number + " - " + inWord);
	}

	/**
	 * 
	 * @param   number  the number to convert in words
	 * @return  String  the equivalent value of number in words.
	 */
	private static String numberInWord(int number) {
		String tensPart[] = new String[]{"twenty","thirty","forty","fifty","sixty","seventy",
				"eighty","ninety"};
		String onesPart[] = new String[]{"zero","one","two","three","four","five","six","seven",
				"eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
				"seventeen","eighteen","nineteen"};
		
		String numInWord = "";
		int value = Math.abs(number);
		if( value < 20 ) {
			numInWord = onesPart[value];
		} else {
		    numInWord = tensPart[(value/10)-2];
		    int ones =  value % 10;
		    if( ones > 0 ) {
		    		numInWord = numInWord + "-" + onesPart[ones]; 
		    }
		}
		if( number < 0 ) {
			numInWord = "negative " + numInWord;
		}
		return numInWord;
	}
}
