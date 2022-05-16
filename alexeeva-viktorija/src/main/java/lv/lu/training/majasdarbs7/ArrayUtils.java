package lv.lu.training.majasdarbs7;

public class ArrayUtils {
    public static int[] reverse(int[] array) {
        return new int[]{};


        int[] result = new int[array.length];

        for( int i = array.length - 1; i >= 0; i--) {
            i = array.length;
        }
        return result;

        for( int i = array.length - 1, j = 0; i >=0; i--,j++) {
            result[j] = array[i];
        }

    }



    }



