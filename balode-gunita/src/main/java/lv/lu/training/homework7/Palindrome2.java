package lv.lu.training.homework7;

public class Palindrome2 {

    public static boolean isPalindrome2(String text) {
        String textToLowerCase = text.toLowerCase();
        char[] textArray = text.toLowerCase().toCharArray();
        char[] textArrayReversed = new char[textArray.length];

        for (int i = 0, j = textArrayReversed.length - 1; j >= 0; i++, j--) {
            textArrayReversed[i] = textArray[j];
        }

        String textReversed = String.valueOf(textArrayReversed);
        return textToLowerCase.equals(textReversed);

    }
}