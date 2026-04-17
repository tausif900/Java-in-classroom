package basics_1;

import java.util.Scanner;

//How to take input.
public class Example1 {
	public static void main(String[] args) { /* jvm enters through main method */
		Scanner sc = new Scanner(System.in); /* Scanner is an object that has multiple properties */

		System.out.println("Enter First number");
		int n = sc.nextInt();

		System.out.println("Enter Second Numer");
		int m = sc.nextInt();

// Operators
//	 Arithmetic Operators
//	 +,-,*,/,%

		System.out.println("Addition is " + (n + m));
		System.out.println(n - m);
		System.out.println(n * m);
		System.out.println(n / m);
		System.out.println(m % n);

//	 System.out.println("Input is given by user is "+n);
//	 System.out.println(n+"is the input given by user");
//	 System.out.println("************"+n+"****************");
	}
}
