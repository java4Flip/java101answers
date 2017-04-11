package edu.itdc.training.exer.controlStructures;

/**
 * Write a program called SumOfSeven to sum those numbers 
 * from 1 to 100 that is divisible by 7, and compute the average.
 * 
 * @author Java4Flip
 *
 */
public class SumOfSeven {
	public static void main(String[] args) {
		int lowerBound = 1;
		int upperBound = 100;
		
		int sum = computeSumOfSeven(lowerBound, upperBound);
		System.out.println("Sum of seven from " + lowerBound +" to " + upperBound + " -> " + sum) ;
	}

	private static int computeSumOfSeven(int lowerBound, int upperBound) {
		if(lowerBound > upperBound ) {
			throw new IllegalArgumentException();
		}
		
		int sum = 0;
		for(int i = lowerBound; i <= upperBound; i++) {
			if( i % 7 == 0 ) {
				sum += i;
			}
		}
		return sum;
	}
}
