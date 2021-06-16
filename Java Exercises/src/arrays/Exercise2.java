package arrays;

public class Exercise2 {

	public static void main(String[] args) {
		
		// Write a Java program to sum values of an array.
		
		int [] intArray = {6,7,3,5,1,54};
		
		int sum = 0;
		
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}

		System.out.println("Zbroj vrijednosti sadržanih u nizu intArray: " + sum);
	}

}
