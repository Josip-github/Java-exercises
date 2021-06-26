package arrays;

public class Exercise03 {

	public static void main(String[] args) {
		
		//Write a Java program to print the square.
		
		int [][] kvadrat = new int[10][10];
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(kvadrat[i][j]);
			}
			System.out.println();
		}

	}

}
