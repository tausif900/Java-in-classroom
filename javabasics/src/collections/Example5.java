package collections;

import java.util.LinkedList;

public class Example5 {
	public static void main(String[] args) {
//	Linkedlist - Store krne ka way different. it inheriits double dequeue... null and duplicates allowed, each and every element is having address of other elements. Searching is not easy

		LinkedList<String> linkedList1 = new LinkedList<String>();
		linkedList1.add("Tausif");
		linkedList1.add("Fahad");
		linkedList1.add("Aman");
		linkedList1.add("Maneesh");

		System.out.println(linkedList1);

		LinkedList<String> linkedList2 = new LinkedList<String>();
		linkedList2.add("Tausif");
		linkedList2.add("Fahad");
		linkedList2.add("Saif");
		linkedList2.add("Khadija");

		System.out.println(linkedList2);
		linkedList1.addAll(linkedList2);
		System.out.println(linkedList1.containsAll(linkedList2));
		System.out.println(linkedList1);

		linkedList1.removeAll(linkedList2);
		System.out.println(linkedList1);

		
		System.out.println(linkedList1.containsAll(linkedList2));
	}
}
