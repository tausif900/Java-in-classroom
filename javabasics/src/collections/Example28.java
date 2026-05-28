package collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Example28 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 6, 12, 45, 200, 45, 5, 200, 19, 10);
//		These methods returns boolean.
//		there should be atlest one matching element.
		System.out.println(list.stream().anyMatch((n) -> n == 120));
		System.out.println(list.stream().allMatch((n) -> n < 500));
//		none of this match the condition
		System.out.println(list.stream().noneMatch(n -> n > 500));

		List<Integer> distincts = list.stream().distinct().toList();
		System.out.println(distincts);

		List<Integer> sortedListAsc = list.stream().sorted().toList();
		System.out.println(sortedListAsc);

		List<Integer> sortedListDsc = list.stream().sorted((a, b) -> b - a).toList();
		System.out.println(sortedListDsc);

		Optional<Integer> min = list.stream().min((a, b) -> a - b);
		System.out.println(min);

		Optional<Integer> max = list.stream().max((b, a) -> b - a);
		System.out.println(max);

		Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);
		System.out.println(sum);

		List<Integer> list1 = list.stream().filter(n -> n <= 10).map(n -> n * n).toList();
		System.out.println(list1);

		long count = list.stream().count();
		System.out.println(count);

		List<String> names = Arrays.asList("Manisha", "Anisha", "Manoj", "Anjani");
		long nameCount = names.stream().filter(n -> n.startsWith("A")).count();
		System.out.println(nameCount);
	}
}
