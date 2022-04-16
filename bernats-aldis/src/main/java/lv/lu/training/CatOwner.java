package lv.lu.training;

public class CatOwner {
    public static void main(String[] args) {
        Cat myCat = new Cat("black", "toms", 7);
        System.out.println("My cat's color - " + myCat.getColor());
        System.out.println("My cat's weight - " + myCat.getWeight());

    }
}
