package _1_basics;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[3];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a number: ");
			arr[i] = input.nextInt();
		}
		if (arr[0] > arr[1]) {
			System.out.println(arr[0] + " is greater");
		} else if (arr[1] > arr[2]) {
			System.out.println(arr[1] + " is greater");
		} else if (arr[2] > arr[0]) {
			System.out.println(arr[2] + " is greater");
		}
	}
}
