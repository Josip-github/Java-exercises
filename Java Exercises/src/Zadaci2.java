import javax.swing.JOptionPane;

public class Zadaci2 {

	public static void main(String[] args) {

		/*
		 * Zadatak 1:
		 * 
		 * Write a program in Java to display the first 10 natural numbers.
		*/
		System.out.println("Zadatak 1: ");
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		
		
		/*
		 * Zadatak 2:
		 * Napi�ite program u kojem se ispisuje nekoliko prvih prirodnih brojeva
		 * i njihov zbroj. Korisnik odre�uje unoso koliko �e ih biti.
		*/
		
		
		System.out.println("\nZadatak 2:");
		int sum = 0;
		int a = Integer.parseInt(
				JOptionPane.showInputDialog("Zadatak 2: Unesite koliko prvih prirodnih"
						+ " brojeva �elite ispisati i njihov zbroj")
				);
		
		System.out.println("Prvih " + a + " prirodnih brojeva: ");
		for(int i = 1; i <= a; i++) {
			System.out.println(i);
			sum += i;
		}
		
		System.out.println("Zbroj prvih " + a + " prirodnih brojeva: " + sum);
		
		
		
		
		
		
		
	
	}

}
