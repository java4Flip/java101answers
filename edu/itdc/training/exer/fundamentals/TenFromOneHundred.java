package edu.itdc.training.exer.fundamentals;

/**
 * Given an integer n, print “true” if it is within 10 of 
 * of 100 and false if otherwise using the ternary conditional 
 * operator only. Note: Math.abs(num) computes 100  
 * the absolute value of a number. 
 * 
 * @author Java4Flip
 *
 */

public class TenFromOneHundred {
	public static void main(String[] args) {
		int base   = 100;
		int offSet = 10;
	
		int number = 93;
		boolean inRange = isNumberInRange(base, number, offSet);
		System.out.println("Is " + number + " within " + offSet + " from " + base + ": " + inRange);
		
		number = 105;
		inRange = isNumberInRange(base, number, offSet);
		System.out.println("Is " + number + " within " + offSet + " from " + base + ": " + inRange);
		
		number = 86;
		inRange = isNumberInRange(base, number, offSet);
		System.out.println("Is " + number + " within " + offSet + " from " + base + ": " + inRange);
		
		number = 111;
		inRange = isNumberInRange(base, number, offSet);
		System.out.println("Is " + number + " within " + offSet + " from " + base + ": " + inRange);
	}
	
	/**
	 * Check if a number is within range/offset from a base number 
	 * 
	 * @param base       
	 * @param number     
	 * @param offSet
	 * @return boolean   true if within offet from base, false if otherwise
	 * 
	 */
	public static boolean isNumberInRange(int base, int number, int offSet) {
		return Math.abs(base - number) <= offSet ? true: false;
	}
	

}
