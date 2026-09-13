package _4_Array;

public class RemoveDuplicates {
	public static void main(String[] args) {
		System.out.println("Remove the duplicate element");
		int number[] = { 10, 20, 10, 30, 20, 40, 30 };

		for (int i = 0; i < number.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (number[i] == number[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				System.out.println(number[i]);
			}
		}
	}
}
