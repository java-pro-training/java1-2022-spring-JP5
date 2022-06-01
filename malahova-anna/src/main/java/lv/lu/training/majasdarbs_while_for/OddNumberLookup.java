package lv.lu.training.majasdarbs_while_for;

public class OddNumberLookup {

    //metode,kas nosaka para/nepara skaitli
    boolean isOdd(int i) {
        return i % 2 != 0;
    }

    public void printOddWithin(int a, int b) {
        for (int i = a; i < b; i++) {
            if (isOdd(i)) {
                System.out.println(i);
            }

            //vel variants- mana versija
    /*public void  printOddWithin(int a, int b){
        for (int i = a; i< b; i++ ) {
            if ( i % 2 == 0) {
                continue;
            }
                else {
                    System.out.println(i);
                }
            } */


        }
    }

}

