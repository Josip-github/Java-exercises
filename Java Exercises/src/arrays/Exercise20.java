package arrays;

public class Exercise20 {

	public static void main(String[] args) {
		
		// Write a Java program to find all pairs of elements in an array
		// whose sum is equal to a specified number.
		
		int niz[] = {5,8,3,9,11,7,10,6,14};
		
		int sum = 15;
		
		for(int i = 0; i < niz.length; i++) {
			for(int j = i + 1; j < niz.length; j++) {
				if (niz[i] + niz[j] == sum) {
					System.out.println("Pair of elements in an array\n"
					+ " whose sum is equal to " + sum + ": " + niz[i] + " " + niz[j]);
				}
			}
		}
		
		

	}

}
