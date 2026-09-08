package _3_loops;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Factorial Program");
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}

		System.out.println(factorial + " is the factorial of the given number");
	}
}
