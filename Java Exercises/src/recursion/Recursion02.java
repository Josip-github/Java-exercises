package recursion;

public class Recursion02 {

	public static void main(String[] args) {

		countBackwards(11);
	}

	private static void countBackwards(int n) {

		if (n == 0) {
			System.out.println("Done.");
		}else {
			System.out.println(n);
			n--;
			countBackwards(n);
		}
	}

}
