import javax.swing.JOptionPane;

public class PrijestupnaGodina {

	public static void main(String[] args) {
		
		/*Zadatak
		 * Korisnik unosi godinu, program ispisuje je li ta godina prijestupna ili ne
		 * pri ra�unanju je li godina prijestupna ili ne, treba znati sljede�e:
		 * - ako je godina djeljiva sa 4, prijestupna je (2004, 2016, 2020)
		 * - ako je godina djeljiva sa 100, nije prijestupna (1700, 1800, 1900)
		 * - ako je godina djeljiva sa 400, prijestupna je (1600, 2000)
		*/
		
		int year = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite godinu koju �elite provjeriti")
				);
		
		if (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0))) {
				System.out.println(year + ". je prijestupna");
		} else {
			System.out.println(year + ". nije prijestupna");
		}
	
		/*
		 * Dodatni komentar za bolje razumijevanje:
		 * 
		 *  logi�ki operator || tra�i da samo jedan uvjet bude to�an/zadovoljen kako
		 *  bi operacija bila izvedena. Prema tome, ako je godina djeljiva sa 400,
		 *  to je dovoljan uvjet da znamo da je ta godina prijestupna. Ako je taj uvjet
		 *  zadovoljen, drugo se ni ne gleda. A ako nije, onda se treba dodatno
		 *  provjeravat. 
		 *  
		 *  Npr. 1600. i 2000. godina - za njih se ni ne gleda dalje, zna se automatski 
		 *  da su prijestupne. ali za 1792 se mora dodatno provjeriti.
		 *  
		 *  Ako je u igri 1792. godina, onda MORA biti djeljiva sa 4 i NE SMIJE biti
		 *  djeljiva sa 100, da bi bila prijestupna. I to je to�no 1792. je prijestupna.
		 *  
		 *  Me�utim, 1800. godina nije prijestupna; 1800. je dodu�e djeljiva sa 4, ali
		 *  je djeljiva i sa 100 �to ju zbog uvjeta (year % 100 != 0) �ini ne-prijestupnom
		 *  
		 *  
		 */

}
}
