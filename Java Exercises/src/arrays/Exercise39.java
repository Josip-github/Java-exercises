package arrays;

public class Exercise39 {

	/*
	 * Write a Java program to print all the LEADERS in the array. Note: An element
	 * is leader if it is greater than all the elements to its right side.
	 */

	public static void main(String[] args) {

		int[] niz = { 10, 9, 14, 23, 15, 0, 9 };

		for (int i = 0; i < niz.length; i++) {

			int j;

			for (j = i + 1; j < niz.length; j++) {
				if (niz[i] <= niz[j]) {
					break;
				}

			}

			if (j == niz.length) {
				System.out.println(niz[i] + " ");
			}
		}
	}

}
