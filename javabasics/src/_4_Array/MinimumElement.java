package _4_Array;

import java.util.Scanner;

public class MinimumElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Find Miminum number from the array");

		int arr[] = new int[5];

		System.out.println("Enter numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min + " is the minimum number from an array");
	}
}
