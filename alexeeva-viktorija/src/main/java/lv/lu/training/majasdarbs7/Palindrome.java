package lv.lu.training.majasdarbs7;

public class Palindrome {

    public static String[] isPalindrome(String[] text) {
        String[] word = new String[text.length];

        for (int i = text.length - 1, j = 0; i >= 0; i--, j++) {
            word[j] = text[i];
        }
        return word;

    }


}
