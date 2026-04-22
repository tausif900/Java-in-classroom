package _1_basics;

public class TypeCasting {
	public static void main(String[] args) {
//	Type Casting- to change the data type
//		Widening typecasting -  going from small to big data type ..it converts automatically
		byte a = 12;
		int b = a; // byte to int
		long c = b; // int to long
		System.out.println(a + " " + b + " " + c);

//		Narrowing typecasting- going from big to small
		int p = 9000;
		short q = (short) p; // int to short conversion ...it is manually conversion
		byte r = (byte) p; // int to byte
		System.out.println(p + " " + q + " " + r);

		System.out.println((char) 65);
	}
}
