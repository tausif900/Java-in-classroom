package _4_Array;

import java.util.Iterator;

public class Example5 {

	public static void main(String[] args) {
		System.out.println("Even numbers");
		System.out.println("-------------------------------------");

		int a[] = { 11, 12, 56, 78, 90, 5 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i] + " is even");
			} else {
				System.out.println(a[i] + " is odd");
			}
		}
		System.out.println("-------------------------------------");
		int b[] = { 12, -34, 89, -30, 45 };
		int count = 0;
		for (int n : b) {
			if (n > 0) {
				System.out.println(n + " is Positive");
				count++;
			} else {
				System.out.println(n + " is Negative");
			}
		}
		System.out.println("Positive numbers count is: " + count);
	}
}

// Homework to find prime number from an array data