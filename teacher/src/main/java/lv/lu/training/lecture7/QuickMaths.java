package lv.lu.training.lecture7;

public class QuickMaths {


    public static int min(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}