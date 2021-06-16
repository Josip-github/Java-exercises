package arrays;

import java.util.Arrays;

public class Exercise1 {

	public static void main(String[] args) {
		
		// Write a Java program to sort a numeric array and a string array.
		
		int [] intArray = {6,7,3,5,1,98,103,54};
		
		String [] stringArray = {"maèak","pas","slon","mrav","riba","dabar","miš","crv"};
		
		System.out.println("intArray prije sortiranja: \n");
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		Arrays.sort(intArray);
		
		System.out.println("\nintArray nakon sortiranja: \n");
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println();
		
		System.out.println("stringArray prije sortiranja \n");
		
		for(int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		
		Arrays.sort(stringArray);
		
		System.out.println("\nstringArray nakon sortiranja \n");
		
		for(int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}

	}

}
