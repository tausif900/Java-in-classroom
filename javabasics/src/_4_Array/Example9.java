package _4_Array;

import java.util.Scanner;

public class Example9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int marks[][] = { { 12, 34, 56 }, { 12, 56, 90 }, { 62, 56, 42 } };
//		Check the index of the number given by user, inside an array 

//		Outer loop chalega uske length ke hisab se
		for (int i = 0; i < marks.length; i++) {

//			Inner loop chalega jbtk value less than hai marks[i].length
			for (int j = 0; j < marks[i].length; j++) {
				if (num == marks[i][j]) {
					System.out.println("Number index is " + i + j);
				}
			}
		}
	}
}
