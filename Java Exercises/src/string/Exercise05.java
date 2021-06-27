package string;

public class Exercise05 {
	
	private static void compareStrings(String str1, String str2) {
		
		int comparison = str1.compareTo(str2);
		
		if (comparison == 0) {
			System.out.println("Stringovi su jednaki.");
		}else {
			System.out.println("Stringovi nisu jednaki.");
		}
	}

	public static void main(String[] args) {

		// Write a Java program to compare two strings lexicographically.
		// Two strings are lexicographically equal if they are the same length
		// and contain the same characters in the same positions.
		
		compareStrings("email", "gmail");
		
		
	}

}
