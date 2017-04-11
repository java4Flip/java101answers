package edu.itdc.training.exer.arrays;

import java.util.Arrays;

/**
 * Sort an array of integers in place. (use any sorting algorithm)
 * 
 * @author Java4Flip - Java para sa mga Filipino
 *
 */
public class BubbleSortArrayDemo {
	public static void main(String[] args) {
		int intArray[] = new int[]{ 7,46,4,56,3,2,6,8,13,45,2,54,-4,2,2,1};
		
		System.out.println("Before sorting:");
		System.out.println(Arrays.toString(intArray));
		
		bubbleSort(intArray);
		System.out.println("After sorting:");
		System.out.println(Arrays.toString(intArray));
	}

	private static void bubbleSort(int[] intArray) {
		for(int i = 0; i < intArray.length; i++  ) {
			boolean swap = false;
			for(int j = i; j < intArray.length; j++ ) {
				
				if( intArray[i] > intArray[j] ) {
					int temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
					swap = true;
				}
			}
			if(!swap) break;  // if no swap happened in the last loop, array already sorted.
		}
	}

}
