package _5_Classes_Objects;

public class _5_isPrimeFunction {

//	Function isPrime
	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for (int i = 2; i < (n / 2); i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		int a[] = { 12, 4, 6, 3, 2, 8, 9 };
		for (int n : a) {
			if (
					isPrime(n)) {
				System.out.println(n);
			}
		}
	}
}

//int n = 3;
//boolean isPrime = true;
//for (int i = 2; i <= (n / 2); i++) {
//	if (n % i == 0) {
//		isPrime = false;
//		break;
//	}
//}
//if (isPrime) {
//	System.out.println(n + " is Prime");
//} else {
//	System.out.println(n + " is not a Prime Number");
//}