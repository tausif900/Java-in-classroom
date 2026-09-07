package _3_loops;

import java.util.Scanner;

public class PrimeNumberFrom1ToN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Prime Numbers From 1 to N");
		System.out.println("Enter n number: ");

		int num = input.nextInt();

		for (int i = 1; i <= num; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
		}
	}
}