package stringExample;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

		String word1 = "silent";
		String word2 = "Tausif";

		char[] charArray1 = word1.toCharArray();
		char[] charArray2 = word2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("It is Anagram");
		} else {
			System.out.println("It is not Anagram");
		}

	}
}
