package string;

public class Exercise17 {
	
	// Write a Java program to get the contents of a given string as a character array.
	
	private static char[] stringToCharArray(String str1) {
		
		char[] charNiz = new char[str1.length()];
		
		for(int i = 0; i < str1.length(); i++) {
			charNiz[i] = str1.charAt(i);
			System.out.println(charNiz[i]);
		}
		return charNiz;
	}

	public static void main(String[] args) {
		
		stringToCharArray("Metoda");
		
	}

}
