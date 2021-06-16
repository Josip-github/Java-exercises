package for_loops;

import javax.swing.JOptionPane;

public class Exercise13 {

	public static void main(String[] args) {
		
		//Writing a program that reads a positive integer N
		// and displays a rectangle of N rows.
		
		int n = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan broj.")
				);	
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
