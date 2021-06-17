package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise19 {

	public static void main(String[] args) {
		
		//Write a Java program to convert an array to ArrayList.
		
		int niz[] = {1,1,50,87,1,43,100};
		
		ArrayList<Integer> lista = new ArrayList<>();
		
		System.out.println("Niz:");
		System.out.println(Arrays.toString(niz));
		
		for(int i = 0; i < niz.length; i++) {
			lista.add(niz[i]);
		}
		
		System.out.println();
		System.out.println("Arraylist: ");
		System.out.println(lista);

	}

}
