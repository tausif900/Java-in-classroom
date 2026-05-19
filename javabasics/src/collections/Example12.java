package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Example12 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		set.add(45);
		set.add(100);
		set.add(67);
		set.add(30);
//		Null Values are not allowed.
		System.out.println(set);
	}
}
