package exception;

import javax.swing.JOptionPane;

public class ObradaIznimki {

	public ObradaIznimki() {
		int i = 0;

		while (true) {

			try {
				i = Integer.parseInt(JOptionPane.showInputDialog("Unesi jedan cijeli broj "));
				break;
			} catch (NumberFormatException e) {
				System.out.println("Nisi unio cijeli broj!");
			}

		}
		System.out.println(i);
	}

	public static void main(String[] args) {

		new ObradaIznimki();
	}
}
