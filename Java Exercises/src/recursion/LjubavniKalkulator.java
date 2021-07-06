package recursion;

import java.util.Arrays;

public class LjubavniKalkulator {

	/*
	 * 1) Napiši svoje ime i ime svoje simpatije. 2) Nakon toga ispod svakog slova
	 * napiši koliko puta se ono ponavlja. 3) Zbroji prvi broj ispod svog imena i
	 * posljedni broj ispod imena simpatije, i tako ponovi sa svakim sljedeæim
	 * brojem. 4) Kad završiš s prvim retkom, prijeði na zbrajanje brojeva u drugom
	 * retku, pa treæem... 5) Na kraju kad dobiješ zbroj u èetvrtom retku, saznat
	 * æeš koliko posto šanse imaš razviti ljubav sa svojom simpatijom. Što si bliže
	 * broju 100, to bolje! Sretno!
	 * 
	 */

	public static void main(String[] args) {

		String ime1 = "Marta", ime2 = "Manuel";

		String imeConcat = ime1 + ime2;

		int[] niz = new int[imeConcat.length()];

		int count = 0;

		for (int i = 0; i < imeConcat.length(); i++) {
			count = 0;
			for (int j = 0; j < imeConcat.length(); j++) {
				if (imeConcat.toLowerCase().charAt(i) == imeConcat.toLowerCase().charAt(j)) {
					count++;
				}
			}
			System.out.print(imeConcat.charAt(i) + ": ");
			System.out.println(count);
			niz[i] = count;
		}

		System.out.println(Arrays.toString(niz));

		// sad imam niz koji je dugaèak imeConcat.length(). i želim ga na dva
		// dijela prepolovit, tj na Martu i Manuela

		int[] niz1 = new int[ime1.length()];
		int[] niz2 = new int[ime2.length()];

		for (int i = 0; i < niz.length; i++) {

			if (i < ime1.length()) {
				niz1[i] = niz[i];
			} else if (i >= ime1.length()) {
				niz2[i - ime1.length()] = niz[i];
			}
		}

		System.out.println();
		System.out.print("Niz prvog imena: " + Arrays.toString(niz1));
		System.out.println();
		System.out.print("Niz drugog imena: " + Arrays.toString(niz2));

	}

}
