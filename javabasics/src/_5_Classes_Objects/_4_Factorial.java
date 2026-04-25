package _5_Classes_Objects;

public class _4_Factorial {

//	Function
	public static int Factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int array[] = { 6, 4, 2, 3 };
		for (int i : array) {
			System.out.println("Factorial of " + i + " is " + Factorial(i));
		}
	}
}
