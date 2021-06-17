package arrays;

import java.util.Arrays;

public class Exercise17 {

	public static void main(String[] args) {
		
		// Write a Java program to find the second largest element in an array.
		
		int niz[] = {1,3,100,87,100,43,100};
		
		Arrays.sort(niz);
		
		System.out.println(Arrays.toString(niz));
		
		for(int i = niz.length - 1; i >= 0; i--) {
			if (niz[i] != niz[i-1]) {
				System.out.println("Drugi najveæi broj u nizu je: " + niz[i-1]);
				break;
			}else {
				continue;
			}
		}
			
	}

}
