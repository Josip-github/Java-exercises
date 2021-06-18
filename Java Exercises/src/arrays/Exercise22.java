package arrays;

public class Exercise22 {

	public static void main(String[] args) {

		// Write a Java program to find a missing number in an array.
		
		int niz[] = {1,2,3,4,6,7,8,9,10};
		
		for(int i = 0; i < niz.length; i++) {
			if (niz[i] == niz.length - 1) {
				break;
			}
			if (niz[i] == niz[i+1] - 1) {
				continue;
			}else if (niz[i] != niz[i+1] - 1) {
				System.out.println("A missing number is: " + (niz[i] + 1));
			}
		}
	}

}
