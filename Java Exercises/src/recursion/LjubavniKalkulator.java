package recursion;

public class LjubavniKalkulator {
	
	/*
	 * 1) Napi�i svoje ime i ime svoje simpatije.
	 * 2) Nakon toga ispod svakog slova napi�i koliko puta se ono ponavlja.
	 * 3) Zbroji prvi broj ispod svog imena i posljedni broj ispod imena simpatije,
	 * 	i tako ponovi sa svakim sljede�im brojem.
	 * 4) Kad zavr�i� s prvim retkom, prije�i na zbrajanje brojeva u drugom retku, pa tre�em...
	 * 5) Na kraju kad dobije� zbroj u �etvrtom retku, saznat �e� koliko posto �anse ima�
	 *  razviti ljubav sa svojom simpatijom.
	 *  �to si bli�e broju 100, to bolje! Sretno!
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
