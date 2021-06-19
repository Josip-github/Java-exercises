package arrays;

import java.util.Arrays;

public class Exercise23 {

	public static void main(String[] args) {
		
		//Write a Java program to move all 0's to the end of an array.
		// Maintain the relative order of the other (non-zero) array elements.
		
		int niz[] = {3,2,0,6,0,1,0,4};
		
		for(int i = 0; i < niz.length; i++) {
			for(int j = i + 1; j < niz.length; j++) {
				if (niz[i] == 0) {
					int temp = niz[i];
					niz[i] = niz[j];
					niz[j] = temp;
				}
			}
		}
	}

}
