package controlstatements;

import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
//		grade
//		marks 0 to 35 C
//		marks 36 to 75 B
//		marks 76 to 100 A	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your marks: ");
		int marks = sc.nextInt();
		
		if (marks >= 0 && marks <= 35) {
			System.out.println("Your Grade is C");
		} else if (marks >= 36 && marks <= 75) {
			System.out.println("Your Grade is B");
		} else if (marks >= 76 && marks <= 100) {
			System.out.println("Your Grade is A");
		} else {
			System.out.println("Please Enter a Valid Marks");
		}
	}
}
