package arrays;

public class Exercise7 {

	public static void main(String[] args) {
		
		// Write a Java program to remove a specific element from an array.
		
		int [] intArray = {6,7,3,5,1,54};
		
		int index = 2;
		
		for(int i = 0; i < intArray.length; i++) {
			if (intArray[i] == intArray[index]) {
				continue;
			}
			System.out.print(intArray[i] + " ");
		}
		
		
		

	}

}
