package _4_Array;

public class SecondLargestElement {
	public static void main(String[] args) {
		System.out.println("Find the Second largest Element");
		int number[] = { 45, 10, 23, 89, 80, 89, 90, 34 };
		int largestNum = number[0];
		int secondLargestNum = number[0];

		for (int i = 1; i < number.length; i++) {
			if (number[i] > largestNum) {
				secondLargestNum = largestNum;
				largestNum = number[i];
			} else if (number[i] > secondLargestNum && number[i] < largestNum) {
				secondLargestNum = number[i];
			}
		}
		System.out.println("Second Largest Number is: " + secondLargestNum);
	}
}
