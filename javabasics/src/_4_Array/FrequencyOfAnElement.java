package _4_Array;

import java.util.Scanner;

public class FrequencyOfAnElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Find the duplicate element");
		int number[] = { 45, 10, 23, 89, 80, 89, 90, 34, 80 };
		int count = 0;

		System.out.println("Enter a number: ");
		int userNum = input.nextInt();
		for (int i = 0; i < number.length; i++) {
			if (userNum == number[i]) {
				count++;
			} 
		}
		System.out.println(userNum + " occurs " + count + " times");
	}
}
