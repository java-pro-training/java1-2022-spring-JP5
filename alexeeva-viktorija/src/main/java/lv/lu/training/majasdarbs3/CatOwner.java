package lv.lu.training.majasdarbs3;

import lv.lu.training.majasdarbs3.Cat;

public class CatOwner {
    public static void main(String[] args) {
       Cat myCat = new Cat("black","Tom",5);

        myCat.setAge(8);
        myCat.setSpecies("ShortHair");

        System.out.println("My cat's color - " + myCat.getColor());
        System.out.println("name - " + myCat.getName());
        System.out.println("species - " + myCat.getSpecies());
        System.out.println("age - " + myCat.getAge());
        System.out.println("weight - " + myCat.getWeight());

        //O.L. Labi. Vienīgi darbs nav izpildīts līdz galam.
        // Nepieciešams ievietot trūkstošās vērtības laukos "species" un "age"
    }
}
