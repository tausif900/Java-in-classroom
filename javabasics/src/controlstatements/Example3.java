package controlstatements;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Calculate Area of a Circle
		System.out.println("Enter radius:");
		int r = sc.nextInt();
//		Java has Math class in default package 'lang' hence no need to import.
		if (r > 0) {
			double area = Math.PI * r * r;
			System.out.println("Area of a Circle is " + area);
		} else {
			System.out.println("Invalid input");
		}
	}
}

// find the area of all shapes using js and java..... Homework
