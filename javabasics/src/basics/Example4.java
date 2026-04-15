package basics;

public class Example4 {
	public static void main(String[] args) {
//		Logical Operators
//		&&-and  ||-or  !-not operators
		System.out.println(true && false); // false
		System.out.println(false && true && false); // false
		System.out.println(10 == 10 && 10 > 6); // true
		System.out.println(10 < 100 && 10 >= 6); // true

		System.out.println(true || false); // true
		System.out.println(false || false); // false
		System.out.println(false || false || true); // false
		System.out.println(!(10 > 100 || 10 != 60)); // true=> !true = false
	}
}
