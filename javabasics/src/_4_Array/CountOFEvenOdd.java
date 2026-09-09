package _4_Array;

import java.util.Scanner;

public class CountOFEvenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[5];
		int evenCount = 0;
		int oddCount = 0;

		System.out.println("Enter numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		for (int i : arr) {
			if (i % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		System.out.println("Even number count is: " + evenCount);
		System.out.println("odd number count is: " + oddCount);
	}
}
