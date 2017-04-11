package edu.itdc.training.exer.controlStructures;

import java.util.Random;
import java.util.Scanner;

/**
 * Write a guessing game where the user has to guess a secret number from 1 to
 * 20. After every guess the program tells the user whether their number was too
 * large or too small. At the end the number of tries needed should be printed.
 * It counts only as one try if they input the same number multiple times
 * consecutively.
 * 
 * @author Java4Flip
 *
 */
public class GuessingGame {
	public static void main(String[] args) {
		Random rd = new Random();
		int number = rd.nextInt(20) + 1;

		Scanner sc = new Scanner(System.in);
		int previous = 0;
		int attempts = 0;
		while (true) {
			System.out.print("Guess a number: ");
			try {
				int guess = sc.nextInt();
				if( guess != previous ) {
					attempts++;
					previous = guess;
				}
				
				if( guess > number ) {
					System.out.println("Lower...");
				} else if( guess < number ) {
					System.out.println("Higher...");
				} else {
					System.out.println("You guess it right in " + attempts + " attempts!");
					break;
				}
			} catch(Exception ex) {
				System.out.println("Oops wrong input.  Try again.");
				sc.nextLine();
			}
		}
	}
}
