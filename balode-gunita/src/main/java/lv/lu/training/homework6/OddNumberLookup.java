package lv.lu.training.homework6;

public class OddNumberLookup {
    public static void main(String[] args) {

        //Skaitlu intervala robeza
        int number = 10;
        System.out.print("List of odd numbers from 1 to "+number+":");

        //Izteiksme FOR, lai nolasitu nepara skaitlus no 1 lidz 10
        for (int i=1; i<=number; i++) {
            if (i%2 != 0) {
                System.out.print(" " +i);
            }
        }

        //Izteiksme WHILE, lai nolasitu nepara skaitlus no 1 lidz 10
//        int i = 1;
//        while (i <=number) {
//            if (i%2 != 0)               //vai ari der if (i%2 ==1)
//            System.out.print(" " +i);
//            i++;
//        }
    }
}

//GB: Man nav skaidrs, ka ir domats izmantot m.d. dokumenta minetas metodes, proti, "boolean isOdd (int number)" un "printOddWithin (int from, int till)".
