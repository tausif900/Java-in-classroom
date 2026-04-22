package _3_loops;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
// Reverse a Number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number to count it's Digit: ");
		int n = sc.nextInt();
		int rev = 0;
		while (n > 0) {
			rev = rev * 10 + (n % 10);
			n = n / 10;
		}
		System.out.println("Reverse of your number is: " + rev);
	}

}
