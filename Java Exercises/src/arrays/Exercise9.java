package arrays;

public class Exercise9 {

	public static void main(String[] args) {
		
		// Write a Java program to insert an element (specific position) into an array.
		
		int [] intArray = {12,7,34,5,1,54};
		
		int element = 20; // element to insert
		
		int index = 4; // index to which I want to insert the element
		
		for(int i = 0; i < intArray.length; i++) {
			if (i == index) {
				intArray[i] = element;
			}
			
			System.out.print(intArray[i] + " ");
		}

	}

}
