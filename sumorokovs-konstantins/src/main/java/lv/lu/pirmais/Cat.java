package lv.lu.pirmais;

public class Cat {
private String color = "Black";
private String name = "Aza";
private String species = "Null";
private int age = 4;
private int weight = 120;

    public Cat(String color, String name, int weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getName() {
        return name;
    }
   public void setName(String name){
        this.name = name;
    }
    public String getSpecies(){
        return species;
    }
    public void setSpecies(){
        this.species = species;
    }
    public int getAge() {
            return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
        public int getWeight() {
            return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
