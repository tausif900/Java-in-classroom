package collections;

import java.util.Arrays;
import java.util.List;

public class Example24 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 23, 56, 100, 9);
		list.stream().forEach((n) -> System.out.println(n));

		List<Integer> squares = list.stream().map(n -> n * n).toList();

		System.out.println(squares);
	}
}
