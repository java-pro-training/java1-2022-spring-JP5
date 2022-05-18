package lv.lu.training.majasdarbs7;

public class PalindromeTest {
    public static void main(String[] args) {
        String[] word = Palindrome.isPalindrome(new String[]{"A", "n", "n", "A"});

        System.out.print("Test of method 'isPalindrome', works .. ");
        if (word[0].equals("A") && word[1].equals("n") && word[2].equals("n") && word[3].equals("A")) {
            System.out.println("Correctly");
        } else {
            System.out.println("Incorrectly");
        }
    }
}
