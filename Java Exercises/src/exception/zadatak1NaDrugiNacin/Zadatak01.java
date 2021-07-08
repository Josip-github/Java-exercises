package exception.zadatak1NaDrugiNacin;

public class Zadatak01 {
	
	// za unesena dva cijela broja ispiši zbroj

	public Zadatak01() {
		
		int broj1 = Input.zbroj("Unesi jedan cijeli broj.", "Neispravan unos");
		int broj2 = Input.zbroj("Unesi jedan cijeli broj.", "Neispravan unos");
		System.out.println(broj1 + broj2);
	}
	
	public static void main(String[] args) {
		
		new Zadatak01();
		}
}
