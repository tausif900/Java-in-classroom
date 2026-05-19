package collections;

import java.util.LinkedHashSet;

public class Example11 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> Set = new LinkedHashSet<Integer>();
		Set.add(20);
		Set.add(12);
		Set.add(40);
		Set.add(78);
		Set.add(19);
		Set.add(null);
		System.out.println(Set);

//		HashSet is unordered and LinkHashSet is Ordered.
//		ArrayList,LinkedList,LinkHashSet are having same methods.
	}
}
