package majasdarbs3;

public class CatOwner {
    public static void main(String[] args) {
        Cat myCat = new Cat("Black","Tom", 5);
       myCat.setAge(44);
       myCat.setSpecies("domestic species");

        System.out.println("My cat's color - " + myCat.getColor());
        System.out.println("name - " + myCat.getName());
        System.out.println("species - " + myCat.getSpecies());
        System.out.println("age - " + myCat.getAge());
        System.out.println("weight - " + myCat.getWeight());
    }
}
