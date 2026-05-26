package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example26 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 56, 90, 100);
		Optional<Integer> first = list.stream().findFirst();
	}
}
