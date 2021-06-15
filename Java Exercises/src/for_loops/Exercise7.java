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
		 *   s vrijedno��u 0. 
		 *   
		 *   U while loopu doga�a se sljede�e: pod uvjetom da je korisnikov broj
		 *   ve�i od 0, loop se nastavlja. 
		 *   Vrijednost varijable sum uve�avamo za rezultat operacije a % 10. 
		 *   Koja je svrha te operacije? - Ako je korisnik unio broj 456,
		 *   onda 456 % 10 = 6, zna�i sum = 0 + 6; nakon toga 456 dijelimo sa 10, a rezultat
		 *   to ga je 45, dakle ta je varijabla ve�a od 0, �to zna�i da se loop
		 *   nastavlja.
		 *   
		 *   sum += 45 % 10; - zna�i da je sum = 6 + 5, zna�i 11.
		 *   45 dijelimo sa 10, dobijemo 4, ve�e je od 0, zna�i loop se nastavlja.
		 *   
		 *   sum += 4 % 10; - zna�i da je sum = 11 + 4.
		 *   4 dijelimo sa 10, dobijemo 0 i to zna�i da se loop zavr�ava,
		 *   a sum je 15, kako se i o�ekivalo(4+5+6)
		 *    
		 */
		
		
		

	}

}
