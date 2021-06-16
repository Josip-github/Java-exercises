package for_loops;

import javax.swing.JOptionPane;

public class Exercise12 {

	public static void main(String[] args) {
		
		// Writing a program that reads a positive integer N
		// and displays a pyramid of stars of N rows.
		
		int n = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan broj")
				);
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
