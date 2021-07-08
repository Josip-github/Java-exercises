package exception;

import java.util.Scanner;

public class ObradaIznimki {

	public ObradaIznimki() {
		int i = 0;
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Unesi jedan cijeli broj ");

			try {
				i = Integer.parseInt(input.nextLine());
				break;
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

		}
		System.out.println(i);
		input.close();
	}

	public static void main(String[] args) {

		new ObradaIznimki();
	}
}
