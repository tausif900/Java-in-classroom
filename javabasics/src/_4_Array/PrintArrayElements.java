package _4_Array;

import java.util.Scanner;

public class PrintArrayElements {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Print Array Elements");

		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a number: ");
			arr[i] = input.nextInt();
		}

		for (int i : arr) {
			System.out.println(i);
		}
	}
}
