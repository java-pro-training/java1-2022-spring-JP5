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

        int[] result1 = ArrayUtils.reverse1(new int[]{1, 2, 3});
        System.out.print("Test of method 'reverse', works .. ");
        if (result1[0] == 3 && result1[1] == 2 && result1[2] == 1) {
            System.out.println("Correctly");
        } else {
            System.out.println("Incorrectly");
        }

        int[] result2 = ArrayUtils.reverse2(new int[]{1, 2, 3});
        System.out.print("Test of method 'reverse', works .. ");
        if (result2[0] == 3 && result2[1] == 2 && result2[2] == 1) {
            System.out.println("Correctly");
        } else {
            System.out.println("Incorrectly");
        }

        int[] result3 = ArrayUtils.reverse3(new int[]{1, 2, 3});
        System.out.print("Test of method 'reverse', works .. ");
        if (result3[0] == 3 && result3[1] == 2 && result3[2] == 1) {
            System.out.println("Correctly");
        } else {
            System.out.println("Incorrectly");
        }

        int[] result4 = ArrayUtils.reverse4(new int[]{1, 2, 3});
        System.out.print("Test of method 'reverse', works .. ");
        if (result4[0] == 3 && result4[1] == 2 && result4[2] == 1) {
            System.out.println("Correctly");
        } else {
            System.out.println("Incorrectly");
        }
    }


}
