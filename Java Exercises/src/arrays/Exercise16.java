package arrays;

import java.util.Arrays;

public class Exercise16 {

	public static void main(String[] args) {
		
		//Write a Java program to remove duplicate elements from an array.
		
		int niz[] = {1,4,56,87,56,43,1};
		int niz2[] = new int[10];
		int niz3[] = new int[10];
		
		for(int i = 0; i < niz.length; i++) {
			for(int j = i + 1; j < niz.length; j++) {
				if (niz[i] == niz[j]) {
					niz2[i] = niz[i];
					niz[i] = 0;		
				}
				
			}
			
		}
		
		for(int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(niz));
		
		
		
		
		
		

	}

}
