package arrays;

import java.util.Arrays;

public class Exercise27 {

	public static void main(String[] args) {

		//Write a Java program to check if an array of integers without 0 and -1
		
		int niz[] = {1,2,9,4,6,5,8};
		
		int n1 = 0;
		int n2 = -1;
		
		boolean contains0IliMinus1 = false;
		
		for(int i = 0; i < niz.length; i++) {
			
			if (niz[i] == n1 || niz[i] == n2) {
				contains0IliMinus1 = true;
				break;
			}else {
				contains0IliMinus1 = false;
			}
		}
		if (contains0IliMinus1) {
			System.out.println("Niz1 sadrži " + n1 + " ili " + n2);
		}else {
			System.out.println("Niz1 ne sadrži ni " + n1 + " ni " + n2);
		}
		
		
		
		
	}

}
