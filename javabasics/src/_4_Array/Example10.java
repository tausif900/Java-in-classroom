package _4_Array;

import java.util.Iterator;
import java.util.Scanner;

public class Example10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//	Declaring a fixed size 2D array
		int marks[][] = new int[4][5];
		String students[] = { "Tausif", "Saif", "Amaan", "Arman" };
		String subjects[] = { "Maths", "Science", "English", "History", "Geography" };

		for (int i = 0; i < marks.length; i++) {
//			jb bhi i ki value increase hogi student ka hr ek naam aaega array ke length ke hisab se
			System.out.println(students[i]);
			for (int j = 0; j < marks[i].length; j++) {
//				same as i , j kbhi increase hoga and subject wise marks puchega
				System.out.print(subjects[j] + ": ");
//				Input lenge and is index pe store karenge
				marks[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------");

//		Enhance loop
//		Array me store hone ke bad uski value print krware hai
		for (int i = 0; i < marks.length; i++) {
			System.out.println("-----------------------------------");
//			students ke naam print krre hai
			System.out.println(students[i]);
			System.out.println("-----------------------------------");
			int sum = 0;
			for (int j = 0; j < marks[i].length; j++) {
//				yha pe marks[i][j] ke andr marks aachuke hai pehle wale nested for loop se, only we r printing here
				System.out.println(subjects[j] + " : " + marks[i][j]);
				sum = sum + marks[i][j];
			}
			System.out.println("-----------------------------------");
			System.out.println("Total Marks is: " + sum);
			System.out.println("Average marks is: " + (sum / marks[i].length));
		}
	}
}

// 10 problems regarding 2D array