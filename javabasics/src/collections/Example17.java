package collections;

import java.util.ArrayDeque;

public class Example17 {
	public static void main(String[] args) {
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		deque.add(12);
		deque.add(19);
		deque.addFirst(100);
		deque.add(30);
		deque.add(20);

		System.out.println(deque.pollFirst());

		System.out.println(deque);

		System.out.println(deque.pollLast());

		System.out.println(deque);

		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
	}
}
