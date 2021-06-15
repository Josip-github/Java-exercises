package for_loops;

import javax.swing.JOptionPane;

public class Exercise10 {

	public static void main(String[] args) {
		
		//Writing a program that displays the reverse of a string.
		
		String str = JOptionPane.showInputDialog("Upišite jednu rijeè");
		String reverse = "";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		
		System.out.println(reverse);

	}

}
