package exception.zadatak1;

import javax.swing.JOptionPane;

public class Zadatak01 {

	// za unesena dva cijela broja ispiši zbroj
	
	public Zadatak01() {
		int broj1 = 0, broj2 = 0;
		
		while (true) {
			try {
				broj1 = Integer.parseInt(JOptionPane.showInputDialog("Unesi jedan cijeli broj "));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Unos je neispravan");
			}
		}
		
		while (true) {
			try {
				broj2 = Integer.parseInt(JOptionPane.showInputDialog("Unesi još jedan cijeli broj "));
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Unos je neispravan");
			}
		}
		int zbroj = broj1 + broj2;
		System.out.println("Zbroj unesenih brojeva: " + zbroj);
		
	}
	
	public static void main(String[] args) {
		
		new Zadatak01();
	}
}
