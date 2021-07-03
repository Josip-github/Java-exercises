package recursion;

public class Recursion04 {
	
	// We have cats and each cat has two eyes. Send the number of cats to a method
	// and return total number of eyes all cats have.

	public static void main(String[] args) {

		System.out.println("Cat eyes: " + catEyes(14));
	}

	public static int catEyes(int cats) {
		
		if (cats == 0) {
			return 0;
		}else {
			return 2 + catEyes(cats - 1);
		}
	}
}


/* 1 maèka - return 2 + 0
 * 2 maèke - return 2 + 2 [jer catEyes(1) returns 2]
 * 3 maèke - return 2 + 4 [jer catEyes(2) returns 4]
 * 4 maèke - return 2 + 6 [jer catEyes(3) returns 6]
 * 5 maèki - return 2 + 8 [jer catEyes(4) returns 8]
 * 
 */
