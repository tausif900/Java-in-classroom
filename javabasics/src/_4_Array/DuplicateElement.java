package _4_Array;

public class DuplicateElement {
	public static void main(String[] args) {
		System.out.println("Find the duplicate element");
		int number[] = { 45, 10, 23, 89, 80, 89, 90, 34, 80 };

		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] == number[j]) {
					System.out.println(number[i] + " is duplicate element");
				}
			}
		}
	}
}
