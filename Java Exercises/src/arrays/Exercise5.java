package arrays;

import javax.swing.JOptionPane;

public class Exercise5 {

	public static void main(String[] args) {
		
		//Write a Java program to test if an array contains a specific value.
		
		int n = Integer.parseInt(
				JOptionPane.showInputDialog("Koji broj tražite u nizu?")
				);
		
		int [] intArray = {6,7,3,5,1,54};
		boolean contains = false;
		
		for(int i = 0; i < intArray.length; i++) {
			if (intArray[i] == n) {
				contains = true;
			}
		}
		
		if(contains) {
			System.out.println("Broj koji ste tražili pronaðen je u nizu.");
		}else {
			System.out.println("Broj koji ste tražili nije sadržan u nizu.");
		}

	}

}
