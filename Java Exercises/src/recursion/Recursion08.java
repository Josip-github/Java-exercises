package recursion;

public class Recursion08 {
	
	/*
	 * Send an integer to a method and return the sum of all the digits contained
	 * in the integer. For example, 123 -> 1 + 2 + 3 = 6. 
	 */

	public static void main(String[] args) {

		System.out.println(sumOfDigits(123));
	}

	public static int sumOfDigits(int num) {
		
		if (num <= 9) {
			return num;
		}else {
			return num % 10 + sumOfDigits(num / 10);
		}
	}
}
