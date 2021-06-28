package string;

public class Exercise14 {
	
	// Write a Java program to compare a given string to another string,
	// ignoring case considerations.
	
	private static int compare(String str1, String str2) {
		
		int comparison = str1.compareToIgnoreCase(str2);
		
		if (comparison == 0) {
			System.out.println("Stringovi su jednaki,"
					+ " eventualna razlika u velikim i malim slovima se ignorira.");
		}else {
			System.out.println("Stringovi nisu jednaki");
		}
		
		return comparison;
	}

	public static void main(String[] args) {
		
		compare("Svemir", "svemir");
		
	}

}
