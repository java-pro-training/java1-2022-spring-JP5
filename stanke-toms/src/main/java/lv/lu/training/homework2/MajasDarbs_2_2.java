package lv.lu.training.homework2;

public class MajasDarbs_2_2 {
    public static void main(String[] args) {
        int side1 = 10;
        int side2 = 15;
        int side3 = 14;
        int side4 = 25;
        int result = side1; // deklarēšana un piešķiršana
        result = result + side2;
        result += side3; // infix operācija
        result += side4;
        System.out.println("perimetrs: " + result);

    }
}
