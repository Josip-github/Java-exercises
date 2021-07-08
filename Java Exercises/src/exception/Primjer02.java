package exception;

import javax.swing.JOptionPane;

public class Primjer02 {
	
	private Osoba osoba; 
	// prije konstruktora moram ovdje kreirati instancu klase osoba,
	// jer ako ju kreiram u konstruktoru, javlja sint. grešku, i instanca
	// onda nije vidljiva u metodama koje pravim nakon konstruktora
	
	public Primjer02() {

		osoba = new Osoba();
		ucitajIme();
		ucitajKilazu();
		System.out.println(osoba);

	}

	private void ucitajKilazu() {
		
		double kilaza = 0.0;
		while (true) {
			try {
				kilaza = Double.parseDouble(JOptionPane.showInputDialog("Unesite kilažu."));
				osoba.setKilaza(kilaza);
				return;
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
								}

	private void ucitajIme() {
		
		String ime;
		while (true) {
			ime = JOptionPane.showInputDialog("Unesi ime");
			if (ime.trim().equals("")) {
				continue;
			}
			
			if (ime.length() > 30) {
				continue;
			}
			osoba.setIme(ime);
			return; // return na ovom mjestu znaèi da se metoda završava, stoga break nije potreban
		}
		
							  }

	public static void main(String[] args) {

		new Primjer02();
	}

	private class Osoba {

		private String ime;
		private double kilaza;

		public String getIme() {
			return ime;
		}

		public void setIme(String ime) {
			this.ime = ime;
		}

		public double getKilaza() {
			return kilaza;
		}

		public void setKilaza(double kilaza) {
			this.kilaza = kilaza;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Ime osobe: " + getIme() + "; kilaža osobe: " + getKilaza();
		}
	}
}
