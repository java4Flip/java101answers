package edu.itdc.training.exer.arrays;

/**
 * Create program that will accept certain number of “double”
 * values, compute for the average, highest and lowest of all 
 * entries that are higher than the average of all the numbers. 
 * (use arrays to store the double values in the program)
 * 
 * @author Java4Flip
 *
 */
public class DoubleValuesStat {
	public static void main(String[] args) {
		double doubleArray[] = new double[]{ 34, 2.25, 43, 23, 56, 42, 24, 65.50, 12.21, 23 };
		
		// Get the average of the original array
		double sumOriginal = 0;
		for( int i = 0; i < doubleArray.length; i++ ) {
			sumOriginal += doubleArray[i];
		}
		double avgOriginal = sumOriginal / doubleArray.length;
		
		double sum = 0;
		int count = 0;
		
		double highest = Double.MIN_VALUE;
		double lowest = Double.MAX_VALUE;
		
		for( int i = 0; i < doubleArray.length; i++ ) {
			if( doubleArray[i] > avgOriginal ) {
				sum += doubleArray[i]; count++;
				highest = highest > doubleArray[i] ? highest : doubleArray[i];
				lowest  = lowest < doubleArray[i] ? lowest : doubleArray[i];	
			}
		}
		System.out.println( "Highest: " + highest );
		System.out.println( "Lowest : " + lowest );
		System.out.println( "Average: " + sum / count );
	}

}
