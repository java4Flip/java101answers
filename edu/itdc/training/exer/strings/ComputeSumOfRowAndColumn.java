package edu.itdc.training.exer.strings;

/**
 * Given the following set of data. Compute the sum of all
 * the columns and rows.
 * 
 * @author Java4Flip
 *
 */
public class ComputeSumOfRowAndColumn {
	public static void main(String[] args) {
		int data[][] = new int[][]{
			{ 23, 45, 10, 40, 33,  6, 10 },
			{ 10, 50, 12, 54, 12, 20, 50 },
			{ 21,  4, 34, 10, 34, 23, 10 },
			{ 22, 21, 54, 53,  9, 22,  8}
		};
		
		int rowSum[] = new int[data.length];
		int colSum[] = new int[data[0].length];
		
		for(int row = 0; row < data.length; row++ ) {
			for( int col = 0; col < data[row].length; col++ ) {
				rowSum[row] += data[row][col];
				colSum[col] += data[row][col];
			}
		}
		
		for(int row = 0; row < data.length; row++ ) {
			for( int col = 0; col < data[row].length; col++ ) {
				System.out.printf("%5d", data[row][col]);
			}
			System.out.printf("%6d\n", rowSum[row]);
		}
		
		System.out.println();
		for(int col = 0; col < colSum.length; col++) {
			System.out.printf("%5d", colSum[col]);
		}
	}
}
