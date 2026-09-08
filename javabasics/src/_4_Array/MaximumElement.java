package _4_Array;

import java.util.Scanner;

public class MaximumElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Find Maximum Elements from an array");

		int arr[] = new int[5];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a number: ");
			arr[i] = input.nextInt();
		}

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max + " is the maximum number");
	}
}
