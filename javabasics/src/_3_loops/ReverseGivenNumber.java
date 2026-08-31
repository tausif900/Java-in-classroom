package _3_loops;

import java.util.Scanner;

public class ReverseGivenNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Reverse a given number program");
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + (num % 10);
			num = num / 10;
		}
		System.out.println("The Reverse of the given number is: " + rev);
	}
}
