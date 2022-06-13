package lv.lu.training._7.md;

public class Palindrome {


    public static boolean isPalindrome(String text) {
        String textToLowerCase = text.toLowerCase();
        char[] textArray = textToLowerCase.toCharArray();
        char[] textArrayReversed = new char[textArray.length];
        for (int i = textArrayReversed.length - 1, j = 0; i >= 0; i--, j++) {
            textArrayReversed[j] = textArray[i];
        }

        String textReversed = String.valueOf(textArrayReversed);
        return textToLowerCase.equals(textReversed);

    }

    public static boolean isPalindrome2(String text) {
        String textToLowerCase = text.toLowerCase();
        char[] textArray = textToLowerCase.toCharArray();
        char[] textArrayReversed = new char[textArray.length];

        for (int i = textArrayReversed.length - 1, j = 0; i >= 0; i--, j++) {
            textArrayReversed[j] = textArray[i];
        }

        int counter = 0;
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] == textArrayReversed[i]) {
                counter++;
            }
        }

        if (counter == textArray.length) {
            return true;
        } else {
            return false;
        }
    }

}






