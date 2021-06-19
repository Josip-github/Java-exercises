package arrays;

public class Exercise24 {

	public static void main(String[] args) {
		
		//Write a Java program to find the number
		// of even and odd integers in a given array of integers.
		
		int evenSum = 0;
		int oddSum = 0;
		
		int niz[] = {1,2,3,4,6,7,8};
		
		for(int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0) {
				evenSum += 1;
			}else {
				oddSum += 1;
			}
		}
		
		System.out.println("Number of even integers: " + evenSum);
		System.out.println("Number of odd integers: " + oddSum);

	}

}
