package edu.itdc.training.exer.arrays;

import java.util.Arrays;

/**
 * Write a program that will find top two numbers from an integer array.
 * 
 * @author Java4Flip  Java para sa mga Filipino
 */
public class FindTopTwoNumbers {
	public static void main(String[] args) {
		int intArray[] = {65,45,6,4,763,5,65,0,98,56,5,489};
		
		System.out.println("int Array given:" + Arrays.toString(intArray));
		
		int topTwo[] = findTopTwoNumbers(intArray);
		System.out.println("Top 2 integers: [" + topTwo[0] + "," + topTwo[1] + "]");
		
		topTwo = findTopTwo(intArray);
		System.out.println("Top 2 integers: [" + topTwo[0] + "," + topTwo[1] + "]");
	}
	
	/**
	 * 
	 * 
	 * @param intArray
	 * @return
	 */
	public static int[] findTopTwoNumbers(int intArray[]) {
		// Sorting array in reverse and get the first 2 int
		for(int i = intArray.length - 1; i > 0; i--  ) {
			for(int j = i; j >= 0; j-- ) {
				if( intArray[i] > intArray[j] ) {
					int temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		return new int[]{ intArray[0], intArray[1]};
	}
	
	/**
	 * 
	 * 
	 * @param   intArray  
	 * @return  int[]     the top 2 highest number from the array  
	 */
	public static int[] findTopTwo(int intArray[]) {
		int top1 = Integer.MIN_VALUE;
		int top2 = Integer.MIN_VALUE;
		
		for(int i = 0; i < intArray.length; i++ ) {
			if(intArray[i] > top1) {
				top2 = top1;
				top1 = intArray[i];
			} else if(intArray[i] > top2 ) {
				top2 = intArray[i];
			}
		}
		return new int[]{ top1,top2 };
	}
}

