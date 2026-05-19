package collections;

import java.util.HashSet;
import java.util.Scanner;

public class Example10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashSet<String> colors = new HashSet<String>();
		for (int i = 0; i <= 5; i++) {
			colors.add(input.next().toLowerCase());
		}
		System.out.println(colors);
	}
}
