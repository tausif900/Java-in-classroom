package stringExample;

public class Practice2 {
	public static void main(String[] args) {

		String s = "Hello";
		StringBuilder sb = new StringBuilder("Hello");

		System.out.println(s + " World");
		System.out.println(s); // immutable

		sb.append(" World");
		System.out.println(sb); // mutable

	}
}
