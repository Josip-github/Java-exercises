package recursion;

public class Recursion01 {
	
	public static void main(String[] args) {
		
		sayHi(7);
	}

	private static void sayHi(int n) {

		if (n == 0) {
			System.out.println("Done.");
		}else {
			n--;
			System.out.println("Hi");
			sayHi(n);
		}
		
	}

}
