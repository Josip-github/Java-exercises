package arrays;

import java.util.Arrays;

public class Exercise18 {

	public static void main(String[] args) {
		
		//Write a Java program to find the second smallest element in an array.
		
		int niz[] = {1,1,50,87,1,43,100};
		
		Arrays.sort(niz);
		
		System.out.println(Arrays.toString(niz));
		
		for(int i = 0; i < niz.length; i++) {
			if (niz[i] != niz[i + 1]) {
				System.out.println("Drugi najmanji broj u nizu je: " + niz[i + 1]);
				break;
			}else {
				continue;
			}
		}

	}

}
