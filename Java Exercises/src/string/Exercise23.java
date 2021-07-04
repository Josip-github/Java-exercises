package string;

public class Exercise23 {
	
	// Write a Java program to find whether a region in the current string
	//matches a region in another string.
	

	public static void main(String[] args) {

		String str1 = "Java programiranje", str2 = "python programiranje";
		
		System.out.println(str1.regionMatches(5, str2, 7, 13));
		
	}

}
