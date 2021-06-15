package for_loops;

import javax.swing.JOptionPane;

public class Exercise3 {

	public static void main(String[] args) {
		
		// Writing a program that reads a sequence of integers
		// from the user and stops by displaying Done” 
		// when the sum of these values exceeds 100.

		
		
		int sum = 0;
		
		for(int i = 0; i < 100; i++) {
			int a = Integer.parseInt(
					JOptionPane.showInputDialog("Unesite jedan cijeli broj.")
					);
			sum += a;
			if(sum >= 100) {
				System.out.println("Done.");
				break;
			}
		}
		System.out.println("Sum: " + sum);
	}

}
