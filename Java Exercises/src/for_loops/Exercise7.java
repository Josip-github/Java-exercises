package for_loops;

import javax.swing.JOptionPane;

public class Exercise7 {

	public static void main(String[] args) {
		
		//Writing a program that displays the sum of digits
		// of an integer read from the user.
		
		//Example: 108 -> 1 + 0 + 8 = 9
		//Example: 1123 -> 1 + 1 + 2 + 3 = 7
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("unesite broj."));
		
		int sum = 0;
		
		while (a > 0) {
			
			sum += a % 10;
			
			a /= 10;
		}
		
		System.out.println("Sum je: " + sum);
		
		/*
		 * U ovom zadatku cilj je ispisati zbroj znamenki broja kojeg je unio korisnik.
		 *  Taj smo broj spremili u varijablu int a. int sum smo inicijalizirali
		 *   s vrijednošæu 0. 
		 *   
		 *   U while loopu dogaða se sljedeæe: pod uvjetom da je korisnikov broj
		 *   veæi od 0, loop se nastavlja. 
		 *   Vrijednost varijable sum uveæavamo za rezultat operacije a % 10. 
		 *   Koja je svrha te operacije? - Ako je korisnik unio broj 456,
		 *   onda 456 % 10 = 6, znaèi sum = 0 + 6; nakon toga 456 dijelimo sa 10, a rezultat
		 *   to ga je 45, dakle ta je varijabla veæa od 0, što znaèi da se loop
		 *   nastavlja.
		 *   
		 *   sum += 45 % 10; - znaèi da je sum = 6 + 5, znaèi 11.
		 *   45 dijelimo sa 10, dobijemo 4, veæe je od 0, znaèi loop se nastavlja.
		 *   
		 *   sum += 4 % 10; - znaèi da je sum = 11 + 4.
		 *   4 dijelimo sa 10, dobijemo 0 i to znaèi da se loop završava,
		 *   a sum je 15, kako se i oèekivalo(4+5+6)
		 *    
		 */
		
		
		

	}

}
