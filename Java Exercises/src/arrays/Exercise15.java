package arrays;

public class Exercise15 {

	public static void main(String[] args) {
		
		//Write a Java program to find the common elements between two arrays of integers.
		
		int [] niz1 = {6,7,1000,5,1,54,27,98};
		
		int [] niz2 = {1,0,1000,444,555,54,72,97};
		
		for(int i = 0; i < niz1.length; i++) {
			for(int j = 0; j < niz2.length; j++) {
				if (niz1[i] == niz2[j]) {
					System.out.println("Common element found: " + niz1[i]);
				}
			}
		}

	}

}
