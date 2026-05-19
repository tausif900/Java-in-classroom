package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Example9 {
	public static void main(String[] args) {
//		Find Out distinct values.
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(90);
		arrayList.add(90);
		arrayList.add(100);
		arrayList.add(100);

		HashSet<Integer> hashSet = new HashSet<Integer>(arrayList);
		System.out.println(hashSet);
	}
}
