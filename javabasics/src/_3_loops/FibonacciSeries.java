package _3_loops;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Fibonacci Series Programme");
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int first = 0;
		int second = 1;
		int next = 0;

		for (int i = 0; i < num; i++) {
			System.out.println(first);
			next = first + second;
			first = second;
			second = next;
		}
	}
}
