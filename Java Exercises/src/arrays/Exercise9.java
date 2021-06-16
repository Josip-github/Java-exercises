package arrays;

import java.util.Random;

public class Exercise9 {

	public static void main(String[] args) {
		
		// Write a Java program to insert an element (specific position) into an array.
		
		int [] intArray = {12,7,34,5,1,54};
		
		Random rand = new Random();
		
		int element = 20; // element to insert
		
		int index = rand.nextInt(intArray.length);
		
		for(int i = 0; i < intArray.length; i++) {
			if (i == index) {
				intArray[i] = element;
			}
			
			System.out.print(intArray[i] + " ");
		}

	}

}
