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
		
		System.out.println("\n");
		
		//UPDATE: sad treba napraviti takav kvadrat samo da je unutra prazan
		// tj., ispisuju se sve zvjezdice samo u prvom i zadnjem redu, 
		// u drugim redovima samo prva i zadnja. 
		
		for(int i = 1; i <= n; i++) {
			if (i == 1 || i == n) {
				
				for(int j = 1; j <= n; j++) {
					System.out.print("*");
				}
				System.out.println();
				
			}else {
				for(int j = 1; j <= n; j++) {
					if (j == 1 || j == n) {
						System.out.print("*");
						
					}else {
						System.out.print(" ");
						
					}
					
				}
				System.out.println();
			}
			
		}
		

	}

}
