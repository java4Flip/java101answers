package edu.itdc.training.exer.controlStructures;

import java.util.Scanner;

/**
 * Write a program which takes a decimal value and two ISO 4217 currency 
 * codes and computes the value of the other currency given a fixed 
 * conversion rate. If one of the currency codes is not known the program 
 * should print an error and list of all known currency codes for 
 * which it has conversion rates.
 * 
 * @author Java4Flip
 *
 */
public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an amount: ");
		double amount = Double.parseDouble(sc.nextLine());
		
		System.out.print("Currency: " );
		String fromCurrency = sc.nextLine();
		
		System.out.print("Convert to: " );
		String toCurrency   = sc.nextLine();
		
		double exchangeRate = exchangeRate(fromCurrency, toCurrency);	
		if(exchangeRate > -1) {  
			System.out.println("Conversion rate 1 " + fromCurrency + " is equal to " 
		          + exchangeRate + " " + toCurrency);
			System.out.printf("Amount in %s: %10.2f",toCurrency, amount * exchangeRate);
		}
	}
	
	/**
	 * Return the current exchange rate between specified currencies.
	 * 
	 * @param  fromCurrency
	 * @param  toCurrency
	 * @return double  exchange rate or -1 found if currency exchange rate not found
	 */
	public static double exchangeRate(String fromCurrency, String toCurrency) {
		double conversionRate = -1;
		switch(fromCurrency) {
		case "PHP":
			switch(toCurrency) {
			case "USD": 	conversionRate = 0.020; break;
			case "EUR": 	conversionRate = 0.0019; break;
			case "GBP": 	conversionRate = 0.016; break;
			case "JPY": 	conversionRate = 2.24; break;
			}
			break;
		case "USD":
			switch(toCurrency) {
			case "PHP": 	conversionRate = 49.64; break;
			case "EUR": 	conversionRate = 0.95; break;
			case "GBP": 	conversionRate = 0.81; break;
			case "JPY": 	conversionRate = 111.27; break;
			}
			break;
		case "EUR":
			switch(toCurrency) {
			case "PHP": 	conversionRate = 52.53; break;
			case "USD": 	conversionRate = 1.06; break;
			case "GBP": 	conversionRate = 0.85; break;
			case "JPY": 	conversionRate = 111.72; break;
			}
			break;
		}
		return conversionRate;
	}
}
