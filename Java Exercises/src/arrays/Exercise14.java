package arrays;

public class Exercise14 {

	public static void main(String[] args) {
		
		//Write a Java program to find the common elements
		// between two arrays (string values)
		
		String[] str1 = {"slon","mi�","lav","ptica","lav","riba","slon","mi�"};
		
		String[] str2 = {"kornja�a","ma�ak","p�ela","ptica","som","riba","mrav","lav","crv"};
		
		for(int i = 0; i < str1.length - 1; i++) {
			for(int j = 0; j < str2.length - 1; j++) {
				if (str1[i] == str2[j]) {
					System.out.println("Common elements between 2 arrays found:" + str1[i]);
				}
			}
		}

	}

}
