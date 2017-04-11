package edu.itdc.training.exer.arrays;

import java.util.Arrays;

/**
 * ExerciseDay4.1
 * 
 * Given an array of integers, find if a certain number is contained 
 * within the array. Print “YES” if the number is found within the array 
 * and “NO” if otherwise.
 *
 * @author Java4Flip - Java para sa mga Filipino
 */

public class FindIntInArray {
	public static void main(String[] args) {
		int arrayOfInt[] = new int[]{ 34,65,32,6,35,1,31,98,67,3};
		
		int number = 35;
		boolean intInArray = findIntInArray(arrayOfInt, number);
		
		if(intInArray) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		// Using Java 8 lambda
		intInArray = Arrays.stream(arrayOfInt).anyMatch( n -> n == number);
		if(intInArray) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	/**
	 * Locate an integer inside an array.
	 * 
	 * @param  intArray  the array of integers
	 *         number    the number to locate 
	 * @return boolean   true if number is found within the array, false if otherwise 
	 */
	public static boolean findIntInArray(int intArray[], int number) {
		boolean intFound = false;
		for( int i = 0; i < intArray.length; i++ ) {
			if( intArray[i] == number ) {
				intFound = true; 
				break;
			}
		}
		return intFound;
	}
}
