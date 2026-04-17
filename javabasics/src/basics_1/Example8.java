package basics_1;

import java.util.Scanner;

public class Example8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Calculate Area of a Circle
		System.out.println("Enter radius:");
		int r = sc.nextInt();
//		Java has Math class in default package 'lang' hence no need to import.
		double area = Math.PI * r * r;
		System.out.println("Area of a Circle is " + area);
	}
}

// find the area of all shapes using js and java..... Homework
