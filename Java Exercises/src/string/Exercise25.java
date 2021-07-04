package string;

public class Exercise25 {
	
	/*
	 * Write a Java program to replace each substring of a given string that
	 *  matches the given regular expression with the given replacement.
	 *  
	 *  Sample string : "The quick brown fox jumps over the lazy dog."
	 *  In the above string replace all the "fox" with "cat".
	 */

	public static void main(String[] args) {

		String str1 = "The quick brown fox jumps over the lazy dog.";
		String str2 = str1.replace("fox", "cat");
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = "ana voli milovana";
		String str4 = str3.replace("ana", "ivana");
		
		System.out.println(str3);
		System.out.println(str4);
	}

}
