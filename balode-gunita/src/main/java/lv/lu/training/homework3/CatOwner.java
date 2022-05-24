package lv.lu.training.homework3;

import lv.lu.training.homework3.Cat;

public class CatOwner {
    public static void main(String[] args) {
        Cat myCat = new Cat ("white", "Ruby", "Oriental", 1, 7);

        System.out.println("My cat");
        System.out.println("Color: "+ myCat.getColor());
        System.out.println("Name: "+ myCat.getName());
        System.out.println("Species: "+ myCat.getSpecies());
        System.out.println("Age: "+ myCat.getAge());
        System.out.println("Weight: "+ myCat.getWeight());

    }
}
