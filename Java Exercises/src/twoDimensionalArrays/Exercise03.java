package twoDimensionalArrays;

public class Exercise03 {

	public static void main(String[] args) {

		// Write a program that prints the maximum of each row in a 2D array.

		int[][] numbers = { 
				{ 1, 2, 55, 4 }, 
				{ 9, 7, 37, 8 }, 
				{ 10, 10, 17, 3 }, 
				{ 20, 29, 99, 14 } 
			};

		int max = 0;
		for (int i = 0; i < numbers.length; i++) {
			max = 0;
			for (int j = 0; j < numbers[i].length; j++) {
				if (max < numbers[i][j]) {
					max = numbers[i][j];
				}
			}
			System.out.println("The max value of " + (i + 1) + ". row is: " + max);
		}
	}

}
