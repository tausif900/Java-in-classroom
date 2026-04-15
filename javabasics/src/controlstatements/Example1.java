package controlstatements;

public class Example1 {
	public static void main(String[] args) {
		boolean subscribed = true;
		int total = 5000;
		if (subscribed) {
			total *= 0.9;
		}
		System.out.println(total);
	}
}
