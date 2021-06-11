import javax.swing.JOptionPane;

public class Zadaci {

	public static void main(String[] args) {
		
		//Zadatak 1:
		//Write a Java program to get a number from the user 
		//and print whether it is positive or negative

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
	}

}
