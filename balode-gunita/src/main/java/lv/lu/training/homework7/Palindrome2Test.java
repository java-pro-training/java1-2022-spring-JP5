package lv.lu.training.homework7;

public class Palindrome2Test {
    public static void main(String[] args) {
        boolean isPalindrome = Palindrome2.isPalindrome2("Level");
        //GB: Ka seit precizi koriget, lai nolasitu vairakus vardus vienlaicigi, piem., ("Level", "Kayak")? Proti, saja gadijuma man nolasa vienu vardu.

        System.out.print("The text you entered is.. ");
        if (isPalindrome) {
            System.out.print( "a palindrome!");
        } else {
            System.out.print( "not a palindrome!");
        }
    }

}
