package for_loops;

import javax.swing.JOptionPane;

public class Exercise5 {

	public static void main(String[] args) {
		
		// Writing a program that reads a positive number N from the user 
		// then indicates if N is prime or not.
		
		// N is a prime number if its divisors are only 1 and N.
		
		int n = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan cijeli broj.")
				);

		boolean isPrime = true;
		
		for(int i = 2; i <=n/2; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println("Prime");
		}else {
			System.out.println("Not prime");
		}
		//System.out.println(isPrime ? "prime" : "not prime");
	}

}
