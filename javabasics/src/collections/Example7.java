package collections;

import java.util.Stack;

public class Example7 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(12);
		stack.push(30);
		stack.push(120);
		System.out.println(stack);

		stack.pop(); // last element removed.
		System.out.println(stack);

		System.out.println("Popped Element is: " + stack.pop()); // this return which element is removed.
		System.out.println(stack);
	}
}
//	Stack-It follows LIFO principle 'Last in First Out'. Undo and Renu features can be implemented using stack only.