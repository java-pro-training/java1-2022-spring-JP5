package lv.lu.training.seventhhomework;

public class PalindromeTest {

    public static void main(String[] args) {

        String[] testData = new String[]{"Racecar", "Level", "Sum summus mus", "abcd"};
        String testCase;

        for (String data : testData) {
            testCase = data;
            if (Palindrome.isPalindrome(testCase)) {
                System.out.println("'" + testCase + "' is palindrome.");
            } else {
                System.out.println("'" + testCase + "' is not palindrome.");
            }
        }
    }
}
