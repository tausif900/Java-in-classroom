package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Two numbers:");
		// we can add multipe catch block with one try block
		try {
			int a = input.nextInt();
			int b = input.nextInt();
			System.out.println("Division is: " + (a / b));
		} catch (InputMismatchException e) {
			System.out.println("Invalid input");
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
	}
}