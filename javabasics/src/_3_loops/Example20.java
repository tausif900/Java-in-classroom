package _3_loops;

import java.util.Scanner;

public class Example20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		int sum = 0;
		do {
			sum = sum + n;
			n = input.nextInt();

		} while (n > 0);
		System.out.println("Sum is : " + sum);
	}
}


// loop related question in java is for Homework



