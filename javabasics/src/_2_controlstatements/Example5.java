package _2_controlstatements;

import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");
		int n = sc.nextInt();

		if (n % 2 == 0)
			System.out.println(n + " is even");
		else
			System.out.println(n + "is odd");

	}
}
