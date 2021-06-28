package string;

public class Exercise12 {
	
	private static boolean equalEnd(String str1, String suffix) {
		
		boolean equalEnd = str1.endsWith(suffix);
		
		if (equalEnd) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {

		// Write a Java program to check whether
		// a given string ends with the contents of another string.
		
		System.out.println(equalEnd("String array", "array"));
	}

}
