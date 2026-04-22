package _2_controlstatements;

import java.util.Scanner;

public class Example7 {
	public static void main(String[] args) {
//		Else if ladder
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		
		int a = input.nextInt();
		if (a > 0) {
			System.out.println(a + " is positive");
		} else if (a < 0) {
			System.out.println(a + " is neagtive");
		} else {
			System.out.println(a + " is Neutral");
		}
	}
}
