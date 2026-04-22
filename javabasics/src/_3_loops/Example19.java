package _3_loops;

import java.util.Scanner;

public class Example19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.println("Hello");
			System.out.println("Enter only 1");
			n = input.nextInt();
		} while (n == 1);
	}
}
