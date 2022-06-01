package lv.lu.training.homework7;

public class PalindromeTest {

    public static void main(String[] args) {
        boolean isPalindrome = Palindrome.isPalindrome("AnnA");
        System.out.println("Test of method 'isPalindrome', works... ");

        if (isPalindrome){
            System.out.println("Correctly");
        } else {
            System.out.println("Incorrectly");
        }
        boolean isPalindrome2 = Palindrome.isPalindrome("Racecar");
    }
}
