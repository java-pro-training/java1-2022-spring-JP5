package lv.lu.training.majasdarbs8;

public class CarParking {
    public static void main(String[] args) {
        Buss myNewBuss = new Buss("Red", 2020, "Volvo", 50);
        Buss myOldBuss = new Buss("Yellow", 1990, "Man", 15);

        System.out.println("My new buss " + myNewBuss);
        System.out.println("My old buss " + myOldBuss);
        System.out.println("Are busses equals: " + myNewBuss.equals(myOldBuss));

    }
}
