package recursion;

public class Recursion03 {
	
	// zbroji prvih 100 brojeva rekurzijom

	public static void main(String[] args) {

		zbrojiPrvihSto(1,0);
	}

	public static void zbrojiPrvihSto(int n, int sum) {
		
		if (n > 100) {
			return;
		}else {
			sum = sum + n;
			System.out.println(sum);
			zbrojiPrvihSto(n + 1, sum);
		}
	}
}
