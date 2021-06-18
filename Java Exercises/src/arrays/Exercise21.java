package arrays;

import java.util.Arrays;

public class Exercise21 {

	public static void main(String[] args) {

		// Write a Java program to test the equality of two arrays.
		
		int niz1[] = {5,8,3,9,11,0};
		int niz2[] = {5,8,3,9,11};
		
		boolean equal = true;
		
		for(int i = 0; i < niz1.length; i++) {
			if (niz1.length == niz2.length && niz1[i] == niz2[i]) {
				equal = true;
			}else {
				equal = false;
				System.out.println("Nizovi nisu jednaki.");
				break;
			}
		}
		
		if (equal) {
			System.out.println("Nizovi su jednaki.");
		}
	}

}
