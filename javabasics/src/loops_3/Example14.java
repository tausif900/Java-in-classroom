package loops_3;

public class Example14 {

	public static void main(String[] args) {
		int n = 3;
		boolean isPrime = true;
		for (int i = 2; i <= (n / 2); i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(n + " is Prime");
		} else {
			System.out.println(n + " is not a Prime Number");
		}
	}
}
