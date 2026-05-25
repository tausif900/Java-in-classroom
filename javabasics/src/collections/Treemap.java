package collections;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Treemap {
	public static void main(String[] args) {
		TreeMap<Integer, List<String>> batches = new TreeMap<Integer, List<String>>();

		batches.put(101, Arrays.asList("Tausif", "Saif", "Khatija", "Arman"));
		batches.put(102, Arrays.asList("Nisha", "Laik", "Zaid", "Arkum"));
		batches.put(103, Arrays.asList("Anisha", "Manisha", "Bhatya", "Desai"));
		System.out.println(batches);
	}
}
