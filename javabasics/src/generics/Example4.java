package generics;

import java.util.function.Predicate;

class M implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		return t % 2 == 0;
	}

}

public class Example4 {
	public static void main(String[] args) {
		boolean ans = new M().test(25);
		System.out.println(ans);
	}
}
// Functional interface are those interface that has only one abstract method.
