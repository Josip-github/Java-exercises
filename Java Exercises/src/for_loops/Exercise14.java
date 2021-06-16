package for_loops;

import javax.swing.JOptionPane;

public class Exercise14 {

	public static void main(String[] args) {
		
		/*Writing a program that reads a positive integer N from the user
		 and displays the following:
		 
		1
		22
		333
		4444
		…
		NNNNN…N
		*/
		
		int n = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan broj.")
				);
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= n; j++) {
				if (j <= i) {
					System.out.print(i);
				}else {
					continue;
				}
				
			}
			System.out.println();
		}
	}

}
