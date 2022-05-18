package lv.lu.training.seventhlecture;


public class SmallestArrayElementDemo {

    public static void main(String[] args) {
        int[] numbers = {61, 97, 4, 37, 12, 15, 66, 555, 33, 4};
        String[] words = {"John", "Peter", "Anna"};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("min= " + min);
    }
}
