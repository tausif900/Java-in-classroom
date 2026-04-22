package loops_3;

import java.util.Scanner;

public class Example15 {

	public static void main(String[] args) {
		for (int n = 1; n <= 4; n++) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(n * i);
			}
			System.out.println("==========================");
		}
	}
}
