package lv.lu.training.lecture7;










public class SumOfArrayElementsDemo {
    public static void main(String[] args) {

        int[] numbers = {15,12,23,666,3,6};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
//            sum = sum + numbers[i]; // Tieši tas pats, tikai garāk
        }
        System.out.println("Sum = " + sum);

    }
}
