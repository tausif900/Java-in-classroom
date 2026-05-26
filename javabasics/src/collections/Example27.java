package collections;

import java.util.ArrayList;
import java.util.Optional;

public class Example27 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			arrayList.add(i);
		}
//		parallelStream works faster than normal stream.
		arrayList.parallelStream().forEach((a) -> System.out.println(a));
		Optional<Integer> obj = arrayList.parallelStream().findAny();
		System.out.println(obj);
	}
}
