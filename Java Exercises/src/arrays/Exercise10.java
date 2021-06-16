package arrays;

import java.util.Arrays;

public class Exercise10 {

	public static void main(String[] args) {
		
		// Write a Java program to find the maximum and minimum value of an array.
		
		int [] intArray = {6,7,1000,5,1,54};
		
		Arrays.sort(intArray);
		
		int maxValue = intArray[intArray.length - 1];
		int minValue = intArray[0];
		
		System.out.println("Max value in the array is: " + maxValue);
		System.out.println("Min value in the array is: " + minValue);

	}

}
