package stringExample;

public class Example8 {

//	Stringbuffer and Stringbuilder are use to create mutable string
//	stringbuffer is syncronized , multiple actions cann't perform at the same time,it is slow,released in 1.0  . stringbuilder is unsyncronized, multiple actions can perform at a time, it is faster,released in 5.0
//	Both have similar methods.
	public static void main(String[] args) {
//		StringBuilder is a class and here we created an object.
//		It changes in the actual string or obj.
//		we give the value using constructor.
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		sb.reverse();
		sb.reverse();
		sb.replace(0, 2, "p");
		sb.delete(0, 2);
		sb.insert(2, "to");
		System.out.println(sb);
	}
}
