package lv.lu.training;

public class CatOwner {
    public static void main(String[]args){

        Cat myCat = new Cat("black", "Tom", "meikun", 5, 4);
      System.out.println("My cat's color - " + myCat.getColor());
      System.out.println("name - " + myCat.getName());
      System.out.println("species - " + myCat.getSpecies());
      System.out.println("age - " + myCat.getAge());
      System.out.println("weight - " + myCat.getWeight());
    }

}
