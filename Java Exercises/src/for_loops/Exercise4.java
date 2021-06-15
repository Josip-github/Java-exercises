package for_loops;

import javax.swing.JOptionPane;

public class Exercise4 {

	public static void main(String[] args) {
		
		// Writing a program that displays the sum of the strict divisors
		// of an integer given by the user.
		
		int a = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan cijeli broj.")
				);
		
		int sum = 0;
		
		for(int i = 1; i <=a/2; i++) {
			if (a % i == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		// <If user types '16', '15' will be printed, because '15' is the sum
		// of strict divisors of '16'; 1 + 2 + 4 + 8 = 15

	}

}
