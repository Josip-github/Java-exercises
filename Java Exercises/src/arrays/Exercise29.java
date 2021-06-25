package arrays;

public class Exercise29 {

	// Write a Java program to check if an array of integers
	// contains two specified elements 65 and 77.
	
	private static boolean check(int[] niz, int n1, int n2) {
		
		boolean containsFirstNumber = false;
		boolean containsSecondNumber = false;
		
		for(int i = 0; i < niz.length; i++) {
			
			if (niz[i] == n1) {
				containsFirstNumber = true;
				break;
			}
		}
		
		for(int i = 0; i < niz.length; i++) {
			
			if (niz[i] == n2) {
				containsSecondNumber = true;
				break;
			}
		}
		
		if (containsFirstNumber && containsSecondNumber) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		 
		int[] brojevi = {65,1,6,2,8,77,100};
		
		System.out.println("Result: " + check(brojevi, 65, 77));
		
		
	}
}
