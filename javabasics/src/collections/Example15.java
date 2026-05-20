package collections;

import java.util.PriorityQueue;

public class Example15 {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(23);
		queue.add(2);
		queue.add(19);
		queue.add(17);
		queue.add(13);
		System.out.println(queue);
//		Whatever is the smallest element is placed at the head of the queue.
		queue.poll(); // removes first element
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);

//		queue.remove(); It does same as poll method does, but remove() shows exception if queue is emtpty.
	}
}
//	Queue-It is an Interface,It follows FIFO Principle 'First In First Out',from tail elements inserted and from head elements are removed.
//	Dequeue-Insertion and deletion can be happesned from both the directoins.
//	PriorityQueue-We are providing the Priority.