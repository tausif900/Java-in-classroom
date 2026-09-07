package _3_loops;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Palindrome Program");
		System.out.println("Enter a number");
		int num = input.nextInt();
		int org = num;

		if (checkPalindrome(num, org)) {
			System.out.println(num + " is a Palindrome");
		} else {
			System.out.println(num + " is not a Palindrome");
		}

	}

	public static boolean checkPalindrome(int num, int org) {
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (rev == org) {
			return true;
		}
		return false;
	}
}
