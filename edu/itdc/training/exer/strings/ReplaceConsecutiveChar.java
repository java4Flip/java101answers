package edu.itdc.training.exer.strings;

public class ReplaceConsecutiveChar {
	public static void main(String[] args) {
		System.out.println(replaceConsecutiveCharWithSingleChar("aaaooxxrfffrwww"));
		System.out.println(replaceConsecutiveCharWithSingleChar("apple pen"));
	}
	
	public static String replaceConsecutiveCharWithSingleChar(String str) {
		String newString = "";
		char previousChar = ' ';
		for(int i = 0; i < str.length(); i++ ) {
			if(str.charAt(i) != previousChar) {
				newString += str.charAt(i);
				previousChar = str.charAt(i);
			}
		}
		return newString;
	}
}
