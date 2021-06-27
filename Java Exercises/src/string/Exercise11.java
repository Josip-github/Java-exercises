package string;

public class Exercise11 {

	public static void main(String[] args) {

		// Write a Java program to create a new String object
		// with the contents of a character array.
		
		char[] charNiz = {'p','r','o','g','r','a','m','i','r','a','n','j','e'};
		
		String str = String.copyValueOf(charNiz, 0, charNiz.length);
		
		System.out.println(str);
		
		
		
		
	}

}
