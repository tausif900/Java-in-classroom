package stringExample;

public class CountWords {
	public static void main(String[] args) {
		String s = " Java is easy to learn ";

		System.out.println(s.trim());
		
		String[] words = s.split(" ");
		System.out.println("Number of words: " + words.length);

		System.out.println("----------------------------------------");
		
		System.out.println(s.replace(" ", ""));

		System.out.println("----------------------------------------");

		System.out.println(s.contains("learn"));
		System.out.println(s.contains("Spring"));

		System.out.println("----------------------------------------");

		System.out.println(s.startsWith("Java"));
		System.out.println(s.endsWith("learn"));

		System.out.println("----------------------------------------");

		System.out.println(s.indexOf("a"));
		System.out.println(s.lastIndexOf("i"));
		
		System.out.println("----------------------------------------");
		
		System.out.println(s.substring(8, 13));
		System.out.println(s.substring(8));
	}
}
