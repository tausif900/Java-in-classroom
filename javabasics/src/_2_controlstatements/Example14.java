package _2_controlstatements;

import java.util.Scanner;

public class Example14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number and according to that you will get a name of a day: ");
		int chooseNumber = sc.nextInt();
		switch (chooseNumber) {
		case '1':
			System.out.println("It's a Monday");
			break;
		case '2':
			System.out.println("It's a Tuesday");
			break;
		case '3':
			System.out.println("It's a Wednesday");
			break;
		case '4':
			System.out.println("It's a Thursday");
			break;
		case '5':
			System.out.println("It's a Friday");
			break;
		case '6':
			System.out.println("It's a Saturday");
			break;
		case '7':
			System.out.println("It's a Sunday");
			break;
		default:
			System.out.println("Name of days comes under only 1 to 7 count");
			break;
		}
	}
}
