package arrays;

public class Exercise12 {

	public static void main(String[] args) {
		
		//Write a Java program to find the duplicate values of an array of integer values.
		
		int [] intArray = {2,13,8,13,17,17,1,2,100,20,8};
		
		for(int i = 0; i < intArray.length - 1; i++) {
			for(int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] == intArray[j]) {
					System.out.println("Duplicate element: " + intArray[i]);
				}
			}
		}
		
		//Komentar: Ovdje trebam nested loop. Kljuèna stvar je da drugi loop ne zapoèinje
		// s vrijednosti 'i' nego i + 1 (j = i + 1). Svaki element u nizu želim usporediti
		//  s preostalim elementima kako bih pronašao element iste vrijednosti. 
		// Kada to želim provjeriti na prvom elementu '2', onda iteraciju zapoèinjem
		// od drugog elementa '13' pa ide sve do kraja i ako se u toj iteraciji pojavljuje
		// element iste vrijednosti kao '2', onda je pronaðena duplicate value.

	}

}
