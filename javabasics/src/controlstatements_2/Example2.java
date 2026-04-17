package controlstatements_2;

public class Example2 {
	public static void main(String[] args) {
		boolean subscribed = false;
		int total = 5000;
		if (!subscribed) {
			total += 200;
		}
		System.out.println(total);
	}
}
