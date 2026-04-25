package _5_Classes_Objects;

public class _3_SumOfNum {

	// Now Caller function will decide to give parameter as much as they want
//	now here when we pass argument, as per our choice , we put 3 dots and because of that n becomes an Array

//	Function
	public static void sumOfNumbers(int... n) {
		int sum = 0;
		for (int i : n) {
			sum = sum + i;
		}
	}

	public static void main(String[] args) {
		sumOfNumbers(26, 54, 96, 102, 64);
	}
}
