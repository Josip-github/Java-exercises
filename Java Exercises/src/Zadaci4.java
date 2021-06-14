
public class Zadaci4 {

	public static void main(String[] args) {
		
		//Write a program in Java to display the n terms of odd natural number
		//and their sum.
		
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
				sum += i;
			}
			
		}
		
		System.out.println(sum);
		
		

	}

}
