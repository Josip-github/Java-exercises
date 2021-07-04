package string;

public class Exercise27 {
	
	//Write a Java program to get a substring of a given string between two specified positions.

	public static void main(String[] args) {
		
		// I want to extract "books and maps" from the Gandalf quote

		String gandalfQuote = "The world is not in your books and maps. It is out there.";
		
		String substring1 = gandalfQuote.substring(gandalfQuote.indexOf("b"), 
				gandalfQuote.indexOf(". "));
		
		System.out.println(gandalfQuote);
		System.out.println(substring1);
	}

}
