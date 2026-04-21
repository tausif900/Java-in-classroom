package loops_3;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter Number:");
			int n = sc.nextInt();
			if (n > 0) {
				System.out.println(n + " is Positive");
			} else if (n < 0) {
				System.out.println(n + " is negative");
			} else {
				System.out.println(n + " is neutral");
			}
		}
	}
}
