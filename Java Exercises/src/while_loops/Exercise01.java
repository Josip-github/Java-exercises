package while_loops;

import javax.swing.JOptionPane;

public class Exercise01 {
	
	// Write a program that reads an integer between 1 and 10

	public static void main(String[] args) {

		int n = Integer.parseInt(
				JOptionPane.showInputDialog(
						"Unesite jedan broj izme�u 1 i 10."));
		
		while(n < 1 || n > 10) {
			
			System.out.println(n + " se ne nalazi izme�u 1 i 10. Poku�ajte ponovno.");
			
			n = Integer.parseInt(
					JOptionPane.showInputDialog(
							"Unesite jedan broj izme�u 1 i 10."));
		}
		
		System.out.println(n);
	}

}
