package collections;

import java.util.TreeSet;

public class Example14 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(12);
		set.add(19);
		set.add(2);
		set.add(18);
		set.add(20);

		System.out.println(set);
		System.out.println(set.lower(19)); // It gives closest element.
		System.out.println(set.headSet(19)); // It gives all elements before 19.
		System.out.println(set.headSet(19, true)); // It gives all elements before 19 but include 19 also.

		System.out.println(set.higher(18)); // It gives after closest element.
		System.out.println(set.tailSet(18)); // It gives all elements after 18
		System.out.println(set.tailSet(18, false)); // It gives element after 18 but without 18.

		System.out.println(set.subSet(12, 20)); // 12 is inclusive 20 is not
		System.out.println(set.subSet(12, true, 20, true)); // 12 is also inclusive now as well as 20

		System.out.println(set.ceiling(3)); // We don't have 3 , so usse greater number milega
		System.out.println(set.floor(14)); // We don't have 14, so usse smaller number milega

//		HashSet and LinkedHashSet doesn't have these methods only treeset has.
	}
}
