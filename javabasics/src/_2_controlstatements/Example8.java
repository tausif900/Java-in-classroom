package _2_controlstatements;

import java.util.Scanner;

public class Example8 {
	public static void main(String[] args) {
// 	Greatest among three number
		Scanner sc = new Scanner(System.in);
		System.out.print("a= ");
		int a = sc.nextInt();

		System.out.print("b= ");
		int b = sc.nextInt();

		System.out.print("c= ");
		int c = sc.nextInt();
		
//	homework to add more else-if ladder.................
		if (a > b && a > c) {
			System.out.println("a is greatest");
		} else if (b > c) {
			System.out.println("b is greatest");
		} else if (c > b) {
			System.out.println("c is greatest");
		}
	}
}
