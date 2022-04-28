package lv.lu.training;

public class CatOwner {
    public static void main(String[] args) {
        Cat niceCat = new Cat("black","Joy",5,"bobcat",3);
        System.out.println("My cat's color is "+ niceCat.getColor());
        System.out.println("My cat's name is "+niceCat.getName());
        System.out.println("My cat weights "+niceCat.getWeight());
        System.out.println("species "+niceCat.getSpecies());
        System.out.println("age "+niceCat.getAge());
    }
}
