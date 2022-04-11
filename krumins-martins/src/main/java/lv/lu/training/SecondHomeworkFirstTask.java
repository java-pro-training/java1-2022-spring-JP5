package lv.lu.training;

public class SecondHomeworkFirstTask {
    public static void main(String[] args) {
        String part1 = "Hello";
        String part2 = "World";
        String result = part1 + " " + part2;
        System.out.println(result);

        int side1 = 10;
        int side2 = 15;
        int side3 = 14;
        int side4 = 25;
        int result2 = side1;
        result2 = result2 + side2;
        result2 += side3;
        result2 += side4;
        System.out.println("Perimeter: " + result2);
    }
}
