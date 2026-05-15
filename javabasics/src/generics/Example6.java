package generics;

import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface I8 {
	void factorial(int n);
}

public class Example6 {
	public static void main(String[] args) {
		I8 obj = (n) -> {
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
			System.out.println("factorial of " + n + " is " + fact);
		};
		obj.factorial(5);

//		Prdeicate is already declared as an interface class so we don't have to declare again just have to write implementation
		Predicate<String> p1 = (s) -> s.contains("a"); // it returns true or false
		System.out.println(p1.test("Mango"));

		Predicate<String> p2 = (s) -> s.toLowerCase().startsWith("a"); // implementation is of test method.
		System.out.println(p2.test("Anand"));

//		Function is also declared as an interface class with the method apply.
		Function<String, Integer> f1 = (s) -> s.length(); // implementation is of apply method.
		System.out.println(f1.apply("Tausif"));

		Function<String, String> f2 = (s) -> s.substring(0, 1) + s.substring(s.length() - 1);
		System.out.println(f2.apply("Tausif"));

//		Print the last digit of number.
		Function<Integer, Integer> f3 = (num) -> num % 10;
		System.out.println(f3.apply(102));
	}
}

