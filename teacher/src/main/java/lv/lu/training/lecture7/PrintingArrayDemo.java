package lv.lu.training.lecture7;


import java.util.Arrays;

public class PrintingArrayDemo {
    public static void main(String[] args) {
        String[] alphabet = new String[5];
        alphabet[0] = "John";
        alphabet[1] = "Peter";
        alphabet[2] = "Frederick";
        alphabet[3] = "Anna";
        alphabet[4] = "Bruce";

        System.out.println("Our array: " + Arrays.toString(alphabet));
        System.out.println("Length of the array is: " + alphabet.length);
        System.out.println("Array element with index 0 is: " + alphabet[0]);
        System.out.println("Array element with index 4 is: " + alphabet[4]);

        for (int i = 0; i < alphabet.length; i++) {
            System.out.println("Hi " + alphabet[i] + "!");
        }
    }
}
