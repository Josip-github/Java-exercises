package exception.zadatak1NaDrugiNacin;

import javax.swing.JOptionPane;

public class Input {

	// Input je pomo�na klasa za rje�avanje zadatka u klasi u istom pod-paketu
	
	public static int zbroj(String ulazPoruka, String exceptionPoruka) {
		
		while (true) {
			
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(ulazPoruka));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, exceptionPoruka);
			}
			
		}
		
	}
	
}
