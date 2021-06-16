package for_loops;

public class Exercise11 {

	public static void main(String[] args) {
		
		//Writing a program that finds if a string is a palindrome string or not.
		// palindrome je rijeè koja isto izgleda neovisno èitamo li ju slijeva
		// ili zdesna (neven, Ana, anavolimilovana, melem,...)
		
		String str = "tenet";
		boolean isPalindrome = true;
		
		for(int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (str.charAt(i) == str.charAt(j)) {
				continue;
			}else {
				isPalindrome = false;
				break;
			}
		}
		
		if (isPalindrome) {
			System.out.println(str + " is palindrome");
		}else {
			System.out.println(str + " is not palindrome.");
		}

	}

}
