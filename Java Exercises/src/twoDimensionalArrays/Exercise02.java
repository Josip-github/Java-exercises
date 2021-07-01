package twoDimensionalArrays;

public class Exercise02 {

	public static void main(String[] args) {

		// Write a program that prints the sum of each column in a 2D array.
		
		int[][] numbers = {
				{1,2,3,4},
				{9,7,5,8},
				{10,10,17,3},
				{20,29,28,14}
		};
		
		//printing 2D-array by columns:
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[j][i] + " ");
			}
			System.out.println();
		}
		
		System.out.println("*******");
		// Solving the exercise
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			sum = 0;
			for(int j = 0; j < numbers[i].length; j++) {
				sum += numbers[j][i];
			}
			System.out.println(sum);		
		}
		
	}

}
