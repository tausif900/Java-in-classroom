package stringExample;

public class Example3 {
	public static void main(String[] args) {
		String name[] = { "Nisha", "Anisha", "Manisha" };
		for (String n : name) {
			if (n.startsWith("A")) {
				System.out.println(n);
			}
		}
		System.out.println("-----------------------------------------");
		String name1[] = { "Nisha", "Anisha", "Manisha", "Anuja", "aman" };
		for (String n : name1) {
			if (n.toUpperCase().startsWith("A")) {
				System.out.println(n);
			}
		}
	}
}
