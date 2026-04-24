package _4_Array;

public class Example8 {
	public static void main(String[] args) {
		int marks[][] = { { 12, 34, 56 }, { 12, 56, 90 }, { 62, 56, 42 } };
//		iterating using normal for loop 

		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[i].length; j++) {
				System.out.println(i + "" + j + " " + marks[i][j]);
			}
		}
	}
}
