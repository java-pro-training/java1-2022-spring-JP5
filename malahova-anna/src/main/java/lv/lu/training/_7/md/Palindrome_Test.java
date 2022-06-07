package lv.lu.training._7.md;

public class Palindrome_Test {

    public static void main(String[] args) {
        boolean isPalindrome = Palindrome.isPalindrome("Anna");

        System.out.print("Test of method 'isPalindrome', works .. ");
        if (isPalindrome) {
            System.out.println("Correctly");
        } else {
            System.out.println("Incorrectly");
        }

        boolean isPalindrome2 = Palindrome.isPalindrome2("Racecar");

        System.out.print("Test of method 'isPalindrome', works .. ");
        if (isPalindrome2) {
            System.out.println("Correctly");
        } else {
            System.out.println("Incorrectly");
        }

    }
}


