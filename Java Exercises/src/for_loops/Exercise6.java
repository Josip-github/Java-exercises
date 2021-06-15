package for_loops;

import javax.swing.JOptionPane;

public class Exercise6 {

	public static void main(String[] args) {
		
		//Writing a program that reads a sequence of positive integers. 
		// The program stops when the user fills a negative value
		// and shows the maximum and the minimum of these numbers. 

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj."));
		int max = a;
		int min = a;
	
		while(true) {
			
			a = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj."));
			
			if(a < 0) {
				break;
			}
			
			if (a > max) {
				max = a;
			}
			
			if (a < min) {
				min = a;
			}
		}
		
		System.out.println("max: " + max + "; min: " + min);
	}

}
