package loops_3;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number to count it's Digit: ");
		int n = sc.nextInt();
		int digitCounts = 0;
		while (n > 0) {
			n = n / 10;
			digitCounts++;
		}
		System.out.println("Total digits your numbers contain are: " + digitCounts);
	}
}
