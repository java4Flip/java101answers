package edu.itdc.training.exer.strings;

/**
 * Vlad is a bad student. Once his teacher asked him to print 
 * the reverse of a given string. He took three hours to solve 
 * it. The teacher got frustrated at Vlad and asked you 
 * the same question. Can you solve it?
 * 
 * @author Java4Flip
 *
 */
public class ReverseString {
	public static void main(String[] args) {
		String str = "TO BE OR NOT TO BE";
		
		// print String in reverse
		for( int i = str.length() - 1; i >= 0; i-- ) {
			System.out.print(str.charAt(i));
		}
	}

}
