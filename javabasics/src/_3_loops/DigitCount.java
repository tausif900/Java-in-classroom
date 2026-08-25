package _3_loops;

import java.util.Scanner;

public class DigitCount {
	public static void main(String[] args) {
		System.out.println("Digit Count Program");

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number: ");
		int num = input.nextInt();
		int digitCount = 0;

		while (num > 0) {
			num = num / 10;
			digitCount++;
		}

		System.out.println("Total digit: " + digitCount);
	}
}
