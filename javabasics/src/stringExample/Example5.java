package stringExample;

public class Example5 {
	public static void main(String[] args) {
		String s1 = "        Tausif           ";
		System.out.println(s1.trim());		//trim removes the space from start and end.
//		compareTo method comapres two string and returns integer positive, negative and zero
//		if first string is big then positive, if first string is small then negative and if both are same then zero.
		System.out.println("A".compareTo("B"));
		System.out.println("A".compareTo("C"));
		System.out.println("C".compareTo("A"));
		System.out.println("C".compareTo("C"));
	}
}
