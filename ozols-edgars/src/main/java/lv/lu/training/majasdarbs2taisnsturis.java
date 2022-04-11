package lv.lu.training;

public class majasdarbs2taisnsturis {
    public static void main(String[] args) {

        int side1 = 10;
        int side2 = 15;
        int side3 = 14;
        int side4 = 25;

        int result = side1; // perimetrs
        result = result + side2;
        result += side3;
        result += side4;

        System.out.print("perimetrs: " + result);
    }
}
