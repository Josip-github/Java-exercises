package arrays;

public class Exercise28 {

	// Write a Java program to check if the sum of all the 10's
	// in the array is exactly 30. 
	// Return false if the condition does not satisfy, otherwise true
	
	private static boolean sumOfTens(int[] niz) {
		int sum = 0;
		
		for(int i = 0; i < niz.length; i++) {
			
			if (niz[i] == 10) {
				sum += niz[i];
			}
			
		}
		
		if (sum == 30) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] nizBrojeva = {0,1,10,2,3,10,7,10,11,5};
		
		System.out.println(sumOfTens(nizBrojeva));
	}
}
