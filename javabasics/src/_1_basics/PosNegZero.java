package _1_basics;

import java.util.Scanner;

public class PosNegZero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();

		if (num > 0) {
			System.out.println("Number is Positive");
		} else if (num < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println("Number is Zero");
		}
	}
}
