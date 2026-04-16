package controlstatements;

import java.util.Scanner;

public class Example11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter First number ");
		int a = input.nextInt();

		System.out.println("Enter Second number ");
		int b = input.nextInt();

		System.out.println("+:add  -:Sub  *:Mul  /:div");
		char choice = input.next().charAt(0); /*
												 * next() is used to take string input that takes only one character
												 * and
												 * CharAt to get index of that string
												 */
		switch (choice) {
		case '+':
			System.out.println("Addition is : " + (a + b));
			break;
		case '-':
			System.out.println("Subtraction is : " + (a - b));
			break;
		case '*':
			System.out.println("Multiplication is : " + (a * b));
			break;
		case '/':
			System.out.println("Division is : " + (a / b));
			break;

		default:
			System.out.println("Invalid operation trying to perform");
		}
	}
}
