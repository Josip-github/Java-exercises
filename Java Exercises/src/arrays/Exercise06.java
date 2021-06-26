package arrays;

import javax.swing.JOptionPane;

public class Exercise06 {

	public static void main(String[] args) {
		
		//Write a Java program to find the index of an array element.
		
		int [] intArray = {6,7,3,5,1,54};
		
		int n = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan element iz niza intArray")
				);
		
		for(int i = 0; i < intArray.length; i++) {
			if (n == intArray[i]) {
				System.out.println("Element koji ste unijeli - " + n + 
						" - \nnalazi se na indexu: " + i);
			}
			
		}
		
		

	}

}
