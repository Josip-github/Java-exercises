import java.util.Scanner;

import javax.swing.JOptionPane;

public class Zadaci3 {

	public static void main(String[] args) {
		
		//Zadatak 1: Write a program in Java to input 5 numbers from keyboard
		//and find their sum and average.
		
		
		/*POÈETAK KOMENTARA
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
		KRAJ KOMENTARA*/
		
		/*
		 * drugi naèin rješavanja istog zadatka:
		 */
		int broj;
		int sum = 0;
		double avg;
		
		System.out.println("Unesite 5 brojeva");
		for(int i = 0; i < 5; i++) {
			Scanner input = new Scanner(System.in);
			broj = input.nextInt();
			
			sum += broj;
		}
		
		avg = sum/5;
		
		System.out.println(sum);
		System.out.println(avg);

		
	}

}
