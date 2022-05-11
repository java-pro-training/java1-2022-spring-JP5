package lv.lu.training;

public class CatOwner {
    public static void main(String[] args) {
        Cat myCat = new Cat ("Red", "Gary", 5);

        System.out.println("My cat");
        System.out.println("Color: "+ myCat.getColor());
        System.out.println("Name: "+ myCat.getName());
        System.out.println("Species: "+myCat.getSpecies());
        System.out.println("Age: "+ myCat.getAge());
        System.out.println("Weight: "+myCat.getWeight());
        }
}
