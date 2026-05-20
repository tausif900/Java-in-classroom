package collections;

import java.util.LinkedList;


public class Example18 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(12);
		list.add(20);
		list.add(40);
		list.add(45);

		System.out.println(list);
		System.out.println(list.pollFirst());
		System.out.println(list);
		System.out.println(list.pollLast());
		System.out.println(list);
		System.out.println(list.peekFirst());
		System.out.println(list);
		System.out.println(list.peekFirst());
		System.out.println(list);

	}
}
