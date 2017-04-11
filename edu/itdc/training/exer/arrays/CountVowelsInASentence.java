package edu.itdc.training.exer.arrays;

public class CountVowelsInASentence {
	public static void main(String[] args) {
		String sentence = "The quick brown fox jumps over the lazy dog near the mouth of the river";
		
		int vowelCount[] = countVowelInASentence(sentence);
		for( int i = 0; i < vowelCount.length; i++ ) {
			switch(i) {
			case 0: System.out.println("a: " + vowelCount[0]); break;
			case 1: System.out.println("e: " + vowelCount[1]);; break;
			case 2: System.out.println("i: " + vowelCount[2]);; break;
			case 3: System.out.println("o: " + vowelCount[3]);; break;
			case 4: System.out.println("u: " + vowelCount[4]);; break;
			}
		}
	}

	private static int[] countVowelInASentence(String sentence) {
		int vowels[] = new int[5];  // assign index 0 -> a, 1 -> e, 2 -> i, 3 -> o, 4 -> u
		
		String newString = sentence.toLowerCase();
		for(int i = 0; i < newString.length(); i++ ) {
			switch(newString.charAt(i)) {
			case 'a': vowels[0]++; break;
			case 'e': vowels[1]++; break;
			case 'i': vowels[2]++; break;
			case 'o': vowels[3]++; break;
			case 'u': vowels[4]++; break;
			}
		}
		return vowels;
	}

}
