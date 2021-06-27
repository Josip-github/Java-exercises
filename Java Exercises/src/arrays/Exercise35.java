package arrays;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Exercise35 {
	
	/*
	 * Write a Java program to find the sum of the two elements of a given array
	 * which is equal to a given integer. 
	 * Sample array: [1,2,4,5,6] 
	 * Target value: 6
	 */

	
	private static void sumOfTwoElements(int[] niz, int element) {

		boolean elementContained = false;

		for (int i = 0; i < niz.length; i++) {

			if (niz[i] == element) {
				elementContained = true;
			} else {
				continue;
			}
		}

		if (elementContained) {
			System.out.println(element + " se nalazi u nizu");

			for (int i = 0; i < niz.length; i++) {

				for (int j = i + 1; j < niz.length; j++) {

					if (niz[i] == element) {
						continue;
					}

					if (niz[i] + niz[j] == element) {

						System.out.println("Two elements" + " whose sum is equal to "
						+ element + " are:" + niz[i]
								+ " and " + niz[j]);
					} else {
						
					}

				}

			}

		} else {
			System.out.println(element + " se ne nalazi u nizu");
		}

	}

	public static void main(String[] args) {

		

		int[] niz = { 1, 2, 4, 5, 6 };

		Exercise35.sumOfTwoElements(niz, 6);
		

	}

}
