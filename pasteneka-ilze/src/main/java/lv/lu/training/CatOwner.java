package lv.lu.training;

import java.sql.SQLOutput;

public class CatOwner {
    public static void main(String[] args) {
    Cat myCat = new Cat("black", "Tom", 5);
        System.out.println("My cat's color -" + myCat.getColor());
        System.out.println("name -" + myCat.getName());
        System.out.println("species -" + myCat.getSpecies());
        System.out.println("age -" + myCat.getAge());
        System.out.println("weight -" + myCat.getWeight());

        Cat myOtherCat = new Cat("grey","Pika","Ielas parastais", 7, 4 );
        System.out.println("My cat's color -" + myOtherCat.getColor());
        System.out.println("Name - " + myOtherCat.getName());
        System.out.println("Species -" + myOtherCat.getSpecies());
        System.out.println("Age -" + myOtherCat.getAge());
        System.out.println("Weight -" + myOtherCat.getWeight());

        //O.L. Labs risinājums, nav gluži pēc uzdevuma nosacījumiem, bet divu konstruktoru izveide parāda to, ka
        // viela labi saprasta.
    }

}
