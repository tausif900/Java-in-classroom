package _4_Array;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		int marks[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");

//		This loop takes the marks 5 times and store in marks naam ka array with the changing in index
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}

//		This loop will print the marks 
		System.out.println("===================================");

//		Now we are adding the marks and avg marks, the logic for that is
		int total = 0;
		int Avg = 0;
		for (int m : marks) {
			System.out.println(m);
			total = total + m;
			Avg = total / marks.length;
		}
		System.out.println("Total Marks: " + total);
		System.out.println("Average Marks: " + Avg);
	}
}
