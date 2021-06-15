package for_loops;

import javax.swing.JOptionPane;

public class Exercise8 {

	public static void main(String[] args) {
		
		//Writing a program that reads an integer n and displays the nth Fibonacci number.
		//Fibonacii sequence is a sequence of numbers wheere the first two numbers
		// in the sequence are 1 and 1.
		//Then, each additional Fibonacci number is the sum of the two previous numbers 
		// in the sequence.
		// 1,1,2,3,5,8,13,21,...
		
		int n = Integer.parseInt(
				JOptionPane.showInputDialog("Upišite koliko brojeva želite u "
						+ "Fibonaccijevom nizu")
				);
		
		int result = 0;
		int a1 = 1;
		int a2 = 1;
		
		for(int i = 1; i <= n - 2; i++) {
			result = a1 + a2;
			a1 = a2;
			a2 = result;
		}
		
		System.out.println("Rezultat Fibonaccijevog niza"
				+ " u kojem ima " + n + " brojeva: " + result);

	}

}
