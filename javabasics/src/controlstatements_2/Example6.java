package controlstatements_2;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
//		nested if
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		
		int a = input.nextInt();
		if (a > 0) {
			System.out.println(a + " is positive");
		} else {
			if (a < 0) {
				System.out.println(a + " is negative");
			} else {
				System.out.println(a + " is Neutral");
			}
		}
	}
}
