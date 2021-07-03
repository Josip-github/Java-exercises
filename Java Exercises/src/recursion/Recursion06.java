package recursion;

public class Recursion06 {
	
	// Fibonacci series

	public static void main(String[] args) {

		System.out.println(fibonacci(8));
		
	}

	public static int fibonacci(int num) {
		
		if (num == 0) {
			return 0;
		}
		
		if (num == 1) {
			return 1;
		}else {
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
		
	}
}
