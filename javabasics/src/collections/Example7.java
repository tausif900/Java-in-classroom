package collections;

import java.util.Stack;

public class Example7 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(stack.empty());
		stack.push(12);
		stack.push(30);
		stack.push(120);
		System.out.println(stack);

		stack.pop(); // last element removed.
		System.out.println(stack);

		System.out.println("Popped Element is: " + stack.pop()); // this return which element is removed.
		System.out.println(stack);

		stack.push(90);
		stack.push(101);
		System.out.println(stack.peek()); // peek() just checks the last element without removing any element.
		System.out.println(stack);

		System.out.println(stack.empty()); // it returns true or false
		System.out.println(stack.search(101)); // it returns index number but from ends element. if the element is not
												// present which we r searching for it returns -1.
	}
}
//	Stack-It follows LIFO principle 'Last in First Out'. Undo and Renu features can be implemented using stack only.

// banace parathesis, infix,prefix,postfix.