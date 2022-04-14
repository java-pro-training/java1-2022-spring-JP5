package lv.lu.training;

public class KvadrataPerimetrs {
    public static void main(String[] args) {
        int malaA = 10;
        int malaB = 15;
        int malaC = 14;
        int malaD = 25;

        int result = malaA;
        result = result + malaB;
        result += malaC;
        result += malaD;
        System.out.println("perimeters: " + result
        );
    }
}
