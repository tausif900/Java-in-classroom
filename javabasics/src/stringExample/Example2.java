package stringExample;

public class Example2 {
	public static void main(String[] args) {
		String s1 = "Tausif";
		System.out.println(s1.length());
		System.out.println(s1.isEmpty()); // checks whether string is empty or not.
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.charAt(5));
		System.out.println(s1.indexOf("T"));
		System.out.println(s1.indexOf("i", 2));
		System.out.println("Hello".equals("Hello"));
		System.out.println("Hello".equalsIgnoreCase("hello"));
		System.out.println("Hello".equalsIgnoreCase("h ello"));
		System.out.println("Hello".substring(0)); // Hello
		System.out.println("Hello".substring(1));// ello
		System.out.println("Hello".substring(1, 4));// ell
		System.out.println("Hello".startsWith("H")); // true
		System.out.println("Hello".endsWith("l"));// false
	}
}
//String is immutable. cann't be changed.
//whenever we apply any action on string always new string will be generated. and the previous one remians same.