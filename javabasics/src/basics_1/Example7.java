package basics_1;

import java.util.Scanner;

public class Example7 {
	public static void main(String[] args) {
//		Calculate area of rectangle
		Scanner sc = new Scanner(System.in); /*
												 * with the help of new keyword Scanner object created and whatever obj
												 * it gives store in a variable with Scanner data type.
												 */
		System.out.print("Enter length: ");
		int length = sc.nextInt();
		System.out.print("Enter Breadth: ");
		int breadth = sc.nextInt();
		System.out.print("Area of rectangle is: " + (length * breadth));
	}
}
