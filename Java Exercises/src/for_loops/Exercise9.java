package for_loops;

import javax.swing.JOptionPane;

public class Exercise9 {

	public static void main(String[] args) {
		
		//Writing a program that displays a string with space after each character.
		
		String str = JOptionPane.showInputDialog("Upišite jednu rijeè");
		
		System.out.println(str);
		
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}

	}

}
