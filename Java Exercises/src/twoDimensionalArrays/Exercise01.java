package twoDimensionalArrays;

public class Exercise01 {
	
	public static void main(String[] args) {
		
		// Write a program that prints the sum of each row in a 2D array.
		
		int[][] numbers = {
				{1,2,3,4},
				{9,7,5,8},
				{10,10,17,3},
				{20,29,28,14}
		};
		
		int sum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
		  sum = 0;
			for(int j = 0; j < numbers[i].length; j++) {
				sum += numbers[i][j]; 
			}
			System.out.println("Zbroj elemenata u " + (i + 1) + ". retku je: " + sum);
		}
		
		
		
	}
	
	
	

}
