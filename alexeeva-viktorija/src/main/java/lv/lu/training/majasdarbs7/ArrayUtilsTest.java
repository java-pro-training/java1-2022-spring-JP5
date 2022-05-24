package lv.lu.training.majasdarbs7;

public class ArrayUtilsTest {
    public static void main(String[] args) {

        int[] result = ArrayUtils.reverse(new int[]{1, 5, 9});
        System.out.print("Test of method 'reverse', works .. ");
        if (result[0] == 9 && result[1] == 5 && result[2] == 1) {
            System.out.println("Correctly");
        } else {
            System.out.println("Incorrectly");
        }
    }


}
