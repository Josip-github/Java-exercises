import javax.swing.JOptionPane;

public class Zadaci {

	public static void main(String[] args) {
		
		//Zadatak 1:
		//Write a Java program to get a number from the user 
		//and print whether it is positive or negative
		/* poèetak zadatka 1
		int a = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan broj.")
				);
		
		if (a > 0) {
			System.out.println("Broj koji ste unijeli (" + a + ") je pozitivan.");
		}else if(a == 0){
			System.out.println("Broj koji ste unijeli "
					+ "(" + a + ") nije ni pozitivan ni negativan.");
		}else {
			System.out.println("Broj koji ste unijeli (" + a + ") je negativan.");
		}
		kraj zadatka 1*/
		
		/*poèetak zadatka 2
		//Zadatak 2
		//Take three numbers from the user and print the greatest number.
		
		int broj1, broj2, broj3;
		
		broj1 = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan broj.")
				);
		
		broj2 = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan broj.")
				);
		
		broj3 = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan broj.")
				);
		
		if (broj1 > broj2 & broj1 > broj3) {
			System.out.println("Najveci broj koji ste unijeli je: " + broj1);
		}else if(broj2 > broj1 & broj2 > broj3){
			System.out.println("Najveci broj koji ste unijeli je: " + broj2);
		}else if(broj3 > broj1 & broj3 > broj2) {
			System.out.println("Najveci broj koji ste unijeli je: " + broj3);
		}else if(broj1 == broj2 & broj2 == broj3) {
			System.out.println("Brojevi koje ste unijeli su jednaki.");
		}
		kraj zadatka 2*/
		
		//Zadatak 3
		/*
		 *Write a Java program that keeps a number from the user and 
		 *generates an integer between 1 and 7 and displays the name of the weekday.
		*/
		
		int dan = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan broj izmeðu 1 i 7")
				);
		
		switch(dan) {
			case 1:
				System.out.println("Ponedjeljak");
				break;
			case 2:
				System.out.println("Utorak");
				break;
			case 3:
				System.out.println("Srijeda");
				break;
			case 4:
				System.out.println("Èetvrtak");
				break;
			case 5:
				System.out.println("Petak");
				break;
			case 6:
				System.out.println("Subota");
				break;
			case 7:
				System.out.println("Nedjelja");
				break;
			default:
				System.out.println("Pogrešan unos.");
				break;
		}
		
	}

}
