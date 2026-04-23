package _4_Array;

public class Example3 {

	public static void main(String[] args) {
		int a[] = new int[4];
		String names[] = { "Tausif", "Arman", "Faizal", "Rashida", "Uzma" };
		a[0] = 11;
		a[1] = 22;
		a[2] = 28;
		a[3] = 40;
//		i ki value goes from 0 to 3 as the length of an array is 4,and 0 is because indexing starts from zero. Rather then writing sysout again & again we have used FOR loop...
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

//			Enhanced ForLoop,, but we don't get access of index if we go with this .....
			for (int n : a) {
				System.out.println(n);
			}

//			It is also called as foreach or iterable
			for (String s : names) {
				System.out.println(s);
			}

			for (int j = 0; j < names.length; j++) {
				System.out.println(names[j]);
			}
		}
	}
}
