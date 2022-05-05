package lv.lu.training.md2;

public class KvadrataPerimetrs {
    public static void main(String[] args) {
        int mala1 = 10;
        int mala2 = 15;
        int mala3 = 14;
        int mala4 = 25;

        int result = mala1;
        result = mala1 + mala2;
        result += mala3;
        result += mala4;

        System.out.println("perimetrs: " + result);

        //O.L. Nodarbības laikā mēs šo skatījāmies, izskatās, ka ir neliela loģikas kļūda 11 rindiņā.
    }
}
