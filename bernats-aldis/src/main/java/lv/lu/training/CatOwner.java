package lv.lu.training;

public class CatOwner {
    public static void main(String[] args) {
        Cat myCat = new Cat("gray", "boss", 7);
        System.out.println("My cat's color - " + myCat.getColor());
        System.out.println("My cat's weight - " + myCat.getWeight());
        System.out.println("My cat's name - " + myCat.getName());

        //O.L. Labi. Vienīgi darbs nav izpildīts līdz galam.
        // Nepieciešams ievietot trūkstošās vērtības laukos "species" un "age"
        // Kā arī abas vērtības jāizvada
    }
}
