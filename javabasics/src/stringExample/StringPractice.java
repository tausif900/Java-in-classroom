package stringExample;

public class StringPractice {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Pranav Engineering");
		int capacity = sb.capacity();
		System.out.println(capacity);
		sb.append(" Java");
		sb.append(" World");
		System.out.println(sb);
		sb.append("12345678901234567890");
		System.out.println(sb.capacity());

		sb.insert(6, "Java ");
		System.out.println(sb);

		sb.delete(6, 10);
		System.out.println(sb);

		System.out.println(sb.indexOf("W"));
		sb.deleteCharAt(7);
		System.out.println(sb);

		sb.replace(6, 10, "Spring");
		System.out.println(sb);

		sb2.reverse();
		System.out.println(sb2);

		char charAt = sb2.charAt(5);
		System.out.println(charAt);
		sb.setCharAt(1, 'a');
		System.out.println(sb);

		int length = sb.length();
		System.out.println(length);
	}
}
