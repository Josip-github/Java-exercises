package arrays;

public class Exercise11 {

	public static void main(String[] args) {
		
		// Write a Java program to reverse an array of integer values.
		
		int [] intArray = {6,7,1000,5,1,54};
		
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		
		System.out.println();
		
		for(int i = intArray.length - 1; i >= 0; i--) {
			System.out.print(intArray[i] + " ");
		}

	}

}
