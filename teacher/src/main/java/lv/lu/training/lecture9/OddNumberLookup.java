package lv.lu.training.lecture9;

public class OddNumberLookup {

    private boolean isOdd(int number){
        return number % 2 == 1;
    }

    public void printOddWithin(int from, int till){
        if (from > till){
            System.out.println("You entered incorrect values: " + from + " and " + till);
        }
        for (int i = from; i < till + 1; i++) {
            if(isOdd(i)){
                if (i == till || i == till -1){
                    System.out.print(i);
                } else {
                    System.out.print(i + ",");
                }
            }
        }
    }
}
