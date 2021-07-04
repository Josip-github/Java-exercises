package string;

import java.util.Arrays;

public class Exercise28 {
	
	// Write a Java program to create a character array containing the contents of a string.

	public static void main(String[] args) {

		String str1 = "Death is just another path. One that we all must take.";
		
		// 1. naèin
		
		char[] charNiz = new char[str1.length()];
		
		for(int i = 0; i < str1.length(); i++) {
			charNiz[i] = str1.charAt(i);
		}
		
		System.out.println(Arrays.toString(charNiz));
	}

}
