package stringExample;

public class PalindromeString {
	public static void main(String[] args) {

		String name = "Madam";
		name = name.toLowerCase();
		boolean isPalindrome = true;

		int i = 0;
		int j = name.length() - 1;

		while (i < j) {
			if (name.charAt(i) != name.charAt(j)) {
				isPalindrome = false;
				break;
			}
			i++;
			j--;
		}

		if (isPalindrome) {
			System.out.println("Given string is a Palindrome");
		} else {
			System.out.println("Given string is not a  Palindrome");
		}
	}
}
