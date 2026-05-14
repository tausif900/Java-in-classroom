package stringExample;

public class Example9 {
	public static void main(String[] args) {
//		Convert mutable string into mutable String
		String s = "Tausif";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(s);
		System.out.println(s.toLowerCase());
	}
}

