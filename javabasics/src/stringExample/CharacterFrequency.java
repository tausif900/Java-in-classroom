package stringExample;

public class CharacterFrequency {

    public static void main(String[] args) {

        System.out.println("Program to count character frequency");

        String word = "programming";

        for (int i = 0; i < word.length(); i++) {

            char currentChar = word.charAt(i);
            boolean isDuplicate = false;
            int countChar = 0;

            // Check if character already appeared before
            for (int j = 0; j < i; j++) {

                if (currentChar == word.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            // Count and print only if character is new
            if (!isDuplicate) {

                for (int j = 0; j < word.length(); j++) {

                    if (currentChar == word.charAt(j)) {
                        countChar++;
                    }
                }

                System.out.println(currentChar + " = " + countChar);
            }
        }
    }
}