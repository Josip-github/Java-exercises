package string;

public class Exercise02 {

	public static void main(String[] args) {

		// Write a Java program to get the character (Unicode code point)
		// at the given index within the String.
		
		String str = "Eclipse IDE";
		
		int a = str.codePointAt(1);
		int b = str.codePointAt(8);
		
		System.out.println("Original string is: " + str);
		
		// prints character at index1 in string
		System.out.println("Character (unicode point): " + a);
		
		// prints character at index8 in string
		System.out.println("Character (unicode point): " + b);
	}

}
