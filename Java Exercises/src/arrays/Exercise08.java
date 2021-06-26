package arrays;

import java.util.Arrays;

public class Exercise08 {

	public static void main(String[] args) {
		
		// Write a Java program to copy an array by iterating the array.
		
		int [] intArray = {6,7,88,3,5,1,54};
		int [] copyArray = new int[intArray.length];
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		
		System.out.println("\n***");
		
		for(int i = 0; i < intArray.length; i++) {
			copyArray[i] = intArray[i];
			System.out.print(copyArray[i] + " ");
		}
		
		

	}

}
