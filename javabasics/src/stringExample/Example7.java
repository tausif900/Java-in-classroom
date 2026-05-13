package stringExample;

public class Example7 {
	public static void main(String[] args) {
//	check whether string is palindrome or not
		String s1 = "Madam";
		s1 = s1.toLowerCase();

		boolean isPalindrome = true;
		int i = 0;
		int j = s1.length() - 1;

		while (i < j) {
			if (s1.charAt(i) != s1.charAt(j)) {
				isPalindrome = false;
				break;
			}
			i++;
			j--;
		}

		if (isPalindrome) {
			System.out.println("Yes,It is a Palindrome");
		} else {
			System.out.println("It is not  a Palindrome");
		}
	}
}
