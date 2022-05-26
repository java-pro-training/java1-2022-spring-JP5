package lv.lu.training;

public class ArrayUtilsTest {

    public static void main(String[] args) {

        System.out.print("Testejam klases ArrayUtils metodi 'reverse', darbojas ..");

        int[] result = ArrayUtils.reverse(new int[]{1, 2, 3});

        if (result[0] == 3 && result[1] == 2 && result[2] == 1) {
            System.out.println("PAREIZI");
        } else {
            System.out.println("NEPAREIZI");
        }

    }
}
