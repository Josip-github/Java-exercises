package arrays;

import java.util.Arrays;

public class Exercise26 {

	public static void main(String[] args) {

		// Write a Java program to compute the average value of an array of integers
		// except the largest and smallest values.
		
		int niz[] = {1,2,3,4,6,7,8,12};
		
		Arrays.sort(niz);
		System.out.println("Niz: " + Arrays.toString(niz));
		
		int avg, sum = 0;
		
		for(int i = 1; i <= niz.length - 2; i++) {
			
			sum += niz[i];
			
		}		
		
		System.out.println("Sum: " + sum);
		
		avg = sum / (niz.length - 2);
		
		System.out.println("Average value of an array of integers\r\n"
				+ "except the largest and smallest values: " + avg);
	}

}
