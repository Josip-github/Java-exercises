package arrays;

public class Exercise7 {

	public static void main(String[] args) {
		
		// Write a Java program to remove a specific element from an array.
		
		int [] intArray = {6,7,3,5,1,54};
		
		int index = 2; //�elim izbrisati element na indeksu 2
		System.out.println("Brisanje elementa preko indeksa");
		for(int i = 0; i < intArray.length; i++) {
			if (intArray[i] == intArray[index]) {
				continue;
			}
			System.out.print(intArray[i] + " ");
		}
		
		int element = 5;//�elim izbrisati element kojemu je sadr�aj 5
		System.out.println("\nBrisanje elementa tako da prona�emo u nizu i zatim obri�emo");
		for(int i = 0; i < intArray.length; i++) {
			if (intArray[i] == element) {
				continue;
			}
			System.out.print(intArray[i] + " ");
		}
		
		

	}

}
