package collections;

import java.util.Arrays;
import java.util.List;

public class Example28 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 67, 45, 200, 19, 100);
//		These methods returns boolean.
//		there should be atlest one matching element.
		System.out.println(list.stream().anyMatch((n) -> n == 120));
		System.out.println(list.stream().allMatch((n) -> n < 500));
	}
}
