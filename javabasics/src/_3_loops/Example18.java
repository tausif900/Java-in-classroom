package _3_loops;

import java.util.Scanner;

public class Example18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 number: ");
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			int n = input.nextInt();
			if (n < 0) {
				continue;
			}
			sum = sum + n;
		}
		System.out.println("Sum of the number: " + sum);
	}
}
