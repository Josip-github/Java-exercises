package recursion;

public class Recursion09 {
	
	// Write a program that finds and prints how many times a certain digit appears
	// in an integer

	public static void main(String[] args) {

		System.out.println(count5(5555));
	}

	public static int count5(int num) {
		
		if (num <= 9) {
			if (num == 5) {
				return 1;
			}else {
				return 0;
			}
		}else {
			if (num % 10 == 5) {
				return 1 + count5(num / 10);
			}else {
				return 0 + count5(num / 10);
			}
		}
	}
}
