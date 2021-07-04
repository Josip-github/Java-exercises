package string;

public class Exercise26 {
	
	// Write a Java program to check whether
	// a given string starts with the contents of another string.

	public static void main(String[] args) {

		String str1 = "Hajduk živi vjeèno", str2 = "Dinamo živi vjeèno", str3 = "Hajduk";
		
		System.out.println("Hajduk:  " + str1.startsWith(str3));
		System.out.println("Dinamo:  " + str2.startsWith(str3));
		
	}

}
