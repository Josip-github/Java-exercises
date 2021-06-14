import java.util.Scanner;

import javax.swing.JOptionPane;

public class Zadaci3 {

	public static void main(String[] args) {
		
		//Zadatak 1: Write a program in Java to input 5 numbers from keyboard
		//and find their sum and average.
		
		
		int a, b, c, d, e;
		int suma;
		double prosjek;
		
		a = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan broj!")
				);
		
		b = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan broj!")
				);
		
		c = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan broj!")
				);
		
		d = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan broj!")
				);
		
		e = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite jedan broj!")
				);
		
		suma = a + b + c + d + e;
		prosjek = suma / 5;
		
		System.out.println("Zbroj svih brojeva koje ste unijeli je: " + suma);
		System.out.println("Prosjek brojeva koje ste unijeli je: " + prosjek);
		
		
	}

}
