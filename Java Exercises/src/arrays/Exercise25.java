package arrays;

import java.util.Arrays;

public class Exercise25 {

	public static void main(String[] args) {

		// Write a Java program to get the difference between
		// the largest and smallest values in an array of integers.
		// The length of the array must be 1 and above.
		
		int niz[] = {1,2,17,4,34,21,59};
		
		int maxEl, minEl, dif;
		
		Arrays.sort(niz);
		System.out.println(Arrays.toString(niz));
		
		minEl = niz[0]; 
		maxEl = niz[niz.length - 1];
		
		dif = maxEl - minEl;
		
		System.out.println(dif);
	}

}
