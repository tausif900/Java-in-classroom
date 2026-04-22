package _3_loops;

public class Example12 {
	public static void main(String[] args) {
		int n = 8;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is: " + fact);
	}
}
