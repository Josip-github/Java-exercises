package recursion;

public class Recursion05 {
	
	// factorial
	// A factorial is a function that multiplies a number
	// by every number below it. For example 5!= 5*4*3*2*1=120.

	public static void main(String[] args) {

		System.out.println(factorial(4));
	}

	public static int factorial(int num) {
		
		if (num == 0 || num == 1) {
			return 1;
		}else {
			return num * factorial(num - 1);
		}
	}
}

// factorial(2) - rješenje je 2 jer: return 2 * factorial(2 - 1)
// factorial(3) - rješenje je 6 jer: return 3 * factorial(3 - 1)
// factorial(4) - rješenje je 24 jer: return 4 * factorial(4 - 1)
// factorial(5) - rješenje je 120 jer: return 5 * factorial(5 - 1)