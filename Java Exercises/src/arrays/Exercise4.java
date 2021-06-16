package arrays;

public class Exercise4 {

	public static void main(String[] args) {
		
		// Write a Java program to calculate the average value of array elements.
		
		int [] intArray = {6,7,3,5,1,54};
		int sum = 0;
		
		
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		
		double sum2 = (double) sum;
		double length2 = (double) intArray.length;
		double avg = sum2/length2;
		System.out.println(avg);

	}

}
