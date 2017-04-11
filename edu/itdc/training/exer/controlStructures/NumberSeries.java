package edu.itdc.training.exer.controlStructures;

import java.util.Scanner;

public class NumberSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Printing the result of number series:\n");
		System.out.println("\t\"a+2^0b,a+2^0b+2^1b,......,a+2^0b+2^1b+...+2^n−1b\"\n\n");
		System.out.print("Enter the value of \'a\' [0 <= a <= 50]: ");
		int a = sc.nextInt();
		System.out.print("Enter the value of \'b\' [0 <= b <= 50]: ");
		int b = sc.nextInt();
		System.out.print("Enter the value of \'n\' [1 <= n <= 15]: ");
		int n = sc.nextInt();
		
		long result = a + (int) Math.pow(2,0) * b;
		for(int i = 1; i < n; i++ ) {
			System.out.printf("%d ", result);
			result += Math.pow(2, i) * b;
		}
		System.out.printf("%d\n", result);
	}

}
