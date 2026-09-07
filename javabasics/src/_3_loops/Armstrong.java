package _3_loops;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Armstrong Program");
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int org = num;
		int digitCount = 0;
		double sum = 0;

		while (num > 0) {
			int lastDigit = num % 10;
			digitCount++;
			num = num / 10;
		}

		num = org;
		System.out.println(digitCount);

		while (num > 0) {
			int lastDigit = num % 10;
			sum += Math.pow(lastDigit, digitCount);
			num = num / 10;
		}
		num = org;
		System.out.println(sum);

		if (sum == org) {
			System.out.println(num + " is Armstrong");
		} else {
			System.out.println(num + " is not Armstrong");
		}
	}
}
