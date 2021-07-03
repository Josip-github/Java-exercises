package recursion;

public class Recursion07 {
	
	// We have mobile phones number 1,2,3... Even numbers of mobile phones
	//have 2 speakers, odd numbers have 1 speaker. Send the number of mobile phones
	// to the method and return the total number of speakers all mobile phones have

	public static void main(String[] args) {

		System.out.println(mobileSpeakers(12));
	}

	public static int mobileSpeakers(int mobiles) {
		
		if (mobiles == 0) {
			return 0;
		}else {
			if (mobiles % 2 == 0) {
				return 2 + mobileSpeakers(mobiles - 1);
			}else {
				return 1 + mobileSpeakers(mobiles - 1);
			}
		}
	}
}
