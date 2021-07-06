package recursion;

public class LjubavniKalkulator {
	
	/*
	 * 1) Napiši svoje ime i ime svoje simpatije.
	 * 2) Nakon toga ispod svakog slova napiši koliko puta se ono ponavlja.
	 * 3) Zbroji prvi broj ispod svog imena i posljedni broj ispod imena simpatije,
	 * 	i tako ponovi sa svakim sljedeæim brojem.
	 * 4) Kad završiš s prvim retkom, prijeði na zbrajanje brojeva u drugom retku, pa treæem...
	 * 5) Na kraju kad dobiješ zbroj u èetvrtom retku, saznat æeš koliko posto šanse imaš
	 *  razviti ljubav sa svojom simpatijom.
	 *  Što si bliže broju 100, to bolje! Sretno!
	 * 
	 */
	

	public static void main(String[] args) {

		String ime1 = "Marta", ime2 = "Manuel";

		String imeConcat = ime1 + ime2;

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
		}

	}

}
