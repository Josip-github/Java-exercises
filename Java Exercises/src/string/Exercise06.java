package string;

public class Exercise06 {
	
	// Write a Java program to compare two strings lexicographically,
	// ignoring case differences.
	
	private static void compareStrings(String str1, String str2) {
		
		int comparison = str1.compareToIgnoreCase(str2);
		
		if (comparison == 0) {
			System.out.println("Stringovi su jednaki,"
					+ " bez obzira na nejednakosti u velièini slova");
		}else {
			System.out.println("Stringovi nisu jednaki.");
		}
	}

	public static void main(String[] args) {

		compareStrings("JosipCota1@email.com", "josipcota1@Email.com");
	}

}
