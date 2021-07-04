package string;

public class Exercise24 {
	
	// Write a Java program to replace a specified character with another character.

	public static void main(String[] args) {

		String str1 = "The quick brown fox jumps over the lazy dog.";
		
		String str2 = str1.replace('d', 'f');	
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println();
		System.out.println("***");
		System.out.println();
		
		String str3 = "programiranje";
		String str4 = str3.replace('r', 'l');
		
		System.out.println(str3);
		System.out.println(str4);
	}

}
