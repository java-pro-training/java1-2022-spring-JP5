package lv.lu.training.seventhhomework;

public class Palindrome {

    private static String reverse(String text) {
        char[] array = text.toCharArray();
        char[] result = new char[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return String.valueOf(result);
    }

    public static boolean isPalindrome(String text) {
        return reverse(text.toLowerCase()).equals(text.toLowerCase());
    }

}
