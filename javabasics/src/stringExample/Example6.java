package stringExample;

public class Example6 {
	public static void main(String[] args) {
		String s1 = "Tausif";
		String vowels[] = { "a", "e", "i", "o", "u" };
		
		
//		Reverse the string
		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.println(s1.charAt(i));
		}
		
		
//		checks whether vowels are present in the string or not.
		boolean found = false;
		for (String v : vowels) {
			if (s1.toLowerCase().contains(v)) { // contains method checks whether the string contains the passes value
												// in the string and on that basis it return true or false
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Vowels are present in the String");
		} else {
			System.out.println("Vowels are not present in the String");
		}
	}
}
