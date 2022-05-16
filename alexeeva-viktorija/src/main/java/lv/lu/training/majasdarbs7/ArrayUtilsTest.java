package lv.lu.training.majasdarbs7;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] result = ArrayUtils.reverse(new int[]{1, 2, 3});

        System.out.print("Test of method 'reverse', works .. ");
        if (result[0] == 3 && result[1] == 2 && result[2] == 1) {
            System.out.println("Correctly");
        } else {
            System.out.println("Incorrectly");
        }


    }

}
