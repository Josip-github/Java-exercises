package arrays;

import java.util.Arrays;

public class Exercise36 {
	
	/*
	 * Write a Java program to find all the unique triplets
	 * such that sum of all the three elements equal
	 * to a specified number.
	 * Sample array: [1, -2, 0, 5, -1, -4]
	 * Target value: 2.
	 */

	private static int[] threeSum(int[] niz, int target) {
		
		int[] noviNiz = new int[3];
		
		for(int i = 0; i < niz.length; i++) {
			for(int j = i; j < niz.length; j++) {
				for(int k = j; k < niz.length; k++) {
					if ( i != j && j != k && i != k && (niz[i] + niz[j] + niz[k] == target)) {
						
						noviNiz[0] = niz[i];
						noviNiz[1] = niz[j];
						noviNiz[2] = niz[k];

					}
				}
			}
		}
		return noviNiz;
	}
	
	
	public static void main(String[] args) {

		int[] niz1 = {1, -2, 0, 5, -1, -4};
		int n = 2;
		
		System.out.println(Arrays.toString(threeSum(niz1, n)));
	}

}
