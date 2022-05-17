package lv.lu.training.majasdarbs7;

public class ArrayUtils {

    public static int[] reverse(int[] array) {
        return new int[]{};
    }

    public static int[] reverse1(int[] array) {
        int[] result1 = new int[array.length];
        return result1;
    }

    public static int[] reverse2(int[] array) {
        int[] result2 = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            i = array.length;
        }
        return result2;
    }

    public static int[] reverse3(int[] array) {
        int[] result3 = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            j = array.length;
        }
        return result3;
    }

    public static int[] reverse4(int[] array) {
        int[] result4 = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result4[j] = array[i];
        }
        return result4;
    }

}




