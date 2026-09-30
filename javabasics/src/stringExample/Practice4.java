package stringExample;

public class Practice4 {
	public static void main(String[] args) {
		String word = "Java Programming";
		int vowels = 0;
		int consonants = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.toLowerCase().charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
					|| word.charAt(i) == 'o' || word.charAt(i) == 'u') {
				vowels++;
			} else {
				consonants++;
			}
		}
		System.out.println("Vowels are: " + vowels + " and Consonants are " + consonants);
	}
}
