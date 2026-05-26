package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example26 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 56, 90, 100);
		Optional<Integer> first = list.stream().findFirst();
		System.out.println(first.get() + 123);

		System.out.println(Arrays.asList(45).stream().findFirst().get());
//		If the list is empty then it gives exception"NoSuchElementException".

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
//		arrayList.add(34);
//		arrayList.add(90);

		Integer i = arrayList.stream().findFirst().orElseThrow(() -> new ArithmeticException("List is empty"));
		System.out.println(i);
	}
}
