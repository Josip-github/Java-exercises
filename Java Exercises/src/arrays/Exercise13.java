package arrays;

public class Exercise13 {

	public static void main(String[] args) {
		
		//Write a Java program to find the duplicate values of an array of string values
		
		String[] str = {"slon","miš","lav","ptica","lav","riba","slon","miš"};
		
		for(int i = 0; i < str.length - 1; i++) {
			for(int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j]) {
					System.out.println("Duplicate element found: " + str[i]);
				}
			}
		}

	}

}
