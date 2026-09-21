package stringExample;

public class CountVowels {

	public static void main(String[] args) {
		String word = "programming";
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("Number of Vowels are " + count);

//		Reverse a String
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.println(word.charAt(i));
		}
	}
}
