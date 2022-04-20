package lv.lu.training;

import java.lang.reflect.WildcardType;

public class CatOwner {
    public static void main(String[] args) {
    MajasDarbs3_Cat myCat = new MajasDarbs3_Cat("black","Tom",5);

    myCat.setAge(10);
    myCat.setSpecies("wild");
System.out.println("My cat color - " + myCat.getColor());
        System.out.println("name - "+myCat.getName());
        System.out.println("spices - "+ myCat.getSpecies());
        System.out.println("age - "+ myCat.getAge());
        System.out.println("wight - "+ myCat.getWeight());


    }
}
