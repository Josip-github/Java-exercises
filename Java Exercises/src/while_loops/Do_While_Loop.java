package while_loops;

import java.util.Scanner;

public class Do_While_Loop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n;
		do {
			System.out.println("Enter a number between 1 and 10.");
			n = input.nextInt();
		} while (n < 1 || n > 10);
	}

}
