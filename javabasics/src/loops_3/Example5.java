package loops_3;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
// 		Palindrome 		e.g 121  --> 121
//		Non-Palidrome   e.g 234 --> 432
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number to count it's Digit: ");
		int n = sc.nextInt();
//		Taking backup bcuz at the end the value of n becomes '0'.
		int og = n;
		int rev = 0;
		
		
		while (n > 0) {
			rev = rev * 10 + (n % 10);
			n = n / 10;
		}
		System.out.println(rev);

		if (og == rev) {
			System.out.println(og + " is Palidrome");
		} else {
			System.out.println(og + " is Non-Palidrome");
		}
	}
}
