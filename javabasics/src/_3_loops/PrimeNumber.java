package _3_loops;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Prime Number Program");
		System.out.println("Enter a number: ");
		int num = input.nextInt();

		if (!isPrime(num)) {
			System.out.println(num + " is not a prime number");
		} else {
			System.out.println(num + " is a prime number");
		}

	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}