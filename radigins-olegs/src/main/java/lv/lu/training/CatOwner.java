package lv.lu.training;

public class CatOwner {
    public static void main(String[] args) {

        Cat myCat = new Cat("blue", "Deniss", "British", 6, 20);

        System.out.println("My cat's color - " + myCat.getColor());
        System.out.println("name - " + myCat.getName());
        System.out.println("species - " + myCat.getSpecies());
        System.out.println("age - " + myCat.getAge());
        System.out.println("weight - " + myCat.getWeight());
    }
}