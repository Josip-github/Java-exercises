package recursion;

public class ZbrojiPrvihStoRekurzijom {

	// zbroji prvih 100 brojeva rekurzijom
	
		public ZbrojiPrvihStoRekurzijom() {
			
			System.out.println(suma(100));
		}
		
		private int suma(int broj) {
			// kljuèna stvar rekurzije: uvjet izlaska iz rekurzije
			// izlazi se kada više ne zoveš samog sebe
			if (broj == 0) {
				return 0;
			}
			// funkcija zove samu sebe = rekurzija
			return broj + suma(broj - 1);
		}
		
		// rekurzija se upotrebljava kada ne znamo koliko je nešto veliko, dugaèko, široko...
		

		
		public static void main(String[] args) {

			new ZbrojiPrvihStoRekurzijom();
		}
	
	
}
