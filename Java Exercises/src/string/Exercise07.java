package string;

public class Exercise07 {
	
	// Write a Java program to concatenate a given string to the end of another string.
	
	private static void concatenation(String str1, String str2) {
		
		String concatenated = str1 + str2;
		
		System.out.println(concatenated);
	}

	public static void main(String[] args) {

		concatenation("Pro", "gram");
	}

}
