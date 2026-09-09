package _4_Array;

import java.util.Scanner;

public class SumOfAnArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;

		System.out.println("Enter numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		for (int i : arr) {
			sum = sum + i;
		}
		System.out.println("Sum of an array: " + sum);
	}
}
