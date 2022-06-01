package lv.lu.training.homework7;

import java.util.Locale;

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
}