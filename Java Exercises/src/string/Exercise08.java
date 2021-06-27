package string;

public class Exercise08 {
	
	// Write a Java program to test
	// if a given string contains the specified sequence of char values.
	
	private static boolean contains(String str1, String str2) {
		
		boolean contain = str1.contains(str2);
		
		if (contain) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(contains("Nogomet", "Noga"));
		
	}

}
