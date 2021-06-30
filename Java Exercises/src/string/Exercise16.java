package string;

public class Exercise16 {
	
	// Write a Java program to get the contents of a given string as a byte array. 
	
	private static String stringToByte(String str1) {
		
		byte[] byteNiz = str1.getBytes();
		
		String str2 = new String(byteNiz);
		
		return str2;
	}

	public static void main(String[] args) {
		
		System.out.println(stringToByte("Java developing"));

	}

}
