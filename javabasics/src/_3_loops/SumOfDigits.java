package _3_loops;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Sum Of All Digits Program");

		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int sum = 0;
		while (num > 0) {
			int lastDigit = num % 10;
			sum = sum + lastDigit;
			num = num / 10;
		}
		System.out.println("Your sum is: " + sum);
	}
}
