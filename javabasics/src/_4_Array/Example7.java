package _4_Array;

public class Example7 {

	public static void main(String[] args) {
//		2D array- Array inside array
		int marks[][] = { { 12, 34, 56 }, { 12, 56, 90 }, { 62, 56, 42 } };
//								0				1				2

//		This is the way to access the 2D array
//		array_name[1st array ka index no.][uske ander wale ke array ka indexno.]
		System.out.println(marks[0][2]);
		System.out.println(marks[1][0]);
		System.out.println(marks[2][1]);

//	Now to access the 2D array with iterable way
//		now as we have array inside array so we are writing n[] mtln pehle is n me inside wala array itterateh hogs
		for (int n[] : marks) {
			for (int i : n) {
				System.out.println(i);
			}
		}
	}
}
