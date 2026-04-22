package _2_controlstatements;

import java.util.Scanner;

public class Example12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		a,e,i,o,u---> vowels or else consonants
		System.out.print("Enter any Character ");
		switch (input.next().charAt(0)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("It is vowel");
			break;
		default:
			System.out.println("It is consonant");
		}

	}
}
