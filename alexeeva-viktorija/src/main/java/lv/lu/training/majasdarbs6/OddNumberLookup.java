package lv.lu.training.majasdarbs6;

public class OddNumberLookup {

    public void printOddWithin(int a, int b) {
        for (int i = a; i < b + 1; i++) {
            if (isOdd(i)) {
                System.out.print(i + ";");
            }
        }
    }

    private boolean isOdd(int i) {
        return i % 2 != 0;
    }


}
