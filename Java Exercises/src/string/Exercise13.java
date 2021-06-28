package string;

public class Exercise13 {
	
	// Write a Java program to check whether two String objects contain the same data.
	
	private static boolean equalData(String str1, String str2) {
		
		boolean equals = str1.equals(str2);
		
		if (equals) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(equalData("nogomet", "rukomet"));
	}

}
