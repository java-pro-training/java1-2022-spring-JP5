package lv.lu.training.seventhlecture;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        int[] leapYearsOld = new int[3];
        leapYearsOld[0] = 2020;
        leapYearsOld[1] = 2016;

        int[] leapYears = {2020, 2016, 2012};

        String name = "John";
        char[] chars = name.toCharArray();
        System.out.println(Arrays.toString(chars));
        System.out.println(chars.length);

        for (char character : chars){
            System.out.println(character);
        }
    }
}
