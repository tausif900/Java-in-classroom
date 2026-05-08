package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");
		try {
			int n = sc.nextInt();

			if (n % 2 == 0)
				System.out.println(n + " is even");
			else
				System.out.println(n + " is odd");
		} catch (InputMismatchException e) {
			System.out.println("Invlaid input");
		}
	}
}
