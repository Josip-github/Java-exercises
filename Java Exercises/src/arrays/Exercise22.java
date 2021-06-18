package arrays;

public class Exercise22 {

	public static void main(String[] args) {

		// Write a Java program to find a missing number in an array.
		
		/*int niz[] = {1,2,3,4,6,7,8,9,10};
		
		for(int i = 0; i < niz.length; i++) {
			if (niz[i] == niz.length - 1) {
				break;
			}
			if (niz[i] == niz[i+1] - 1) {
				continue;
			}else if (niz[i] != niz[i+1] - 1) {
				System.out.println("A missing number is: " + (niz[i] + 1));
			}
		}*/
		
		
		int niz2[] = {1,2,4,5,6,7,8};
		
		//Najveæi broj u ovom nizu je 8
		
		// formula je sljedeæa:
		
		//1+2+3+4+5+6+7+8 = 8 * ((8+1) / 2)
		
		//ako jedan element nedostaje, to æe u konaènom rezultatu biti vidljivo
		
		int maxElement = niz2[6];
		
		int expectedSumElements =  maxElement * (maxElement + 1) / 2;
		
		int sumArrayElements = 0;
		
		System.out.println("maxEl: " + maxElement);
		
		System.out.println("sumEl: " + expectedSumElements);
		
		for(int i = 0; i < niz2.length; i++) {
			sumArrayElements += niz2[i];
		}
		
		System.out.println("A missing element is: " +
		(expectedSumElements - sumArrayElements));
	}

}
