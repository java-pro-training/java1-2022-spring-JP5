package lv.lu.training.homework6;

public class OddNumberLookup {

    boolean isOdd(int number) {
        return number %2 != 0;
    }

    public void printOddWithin(int from, int till) {
        System.out.print("List of odd numbers from "+from+" till "+till+": ");
        for (int i = from; i <= till; i++) {
            if (isOdd(i)) {
                System.out.print(i+ "; ");
            }
        }
    }
}
