import java.util.Scanner;

public class Zadaci5 {

	public static void main(String[] args) {
		
		//Korisnik unosom odreðuje koliko prvih neparnih brojeva
		//program treba ispisati te potom njihov zbroj
		
		Scanner input = new Scanner(System.in);
		System.out.println("Koliko prvih neparnih brojeva želite "
				+ "da program ispiše i njihov zbroj?");
		
		int n = input.nextInt();
		int sum = 0;
		
		for(int i = 0; i < n*2; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
