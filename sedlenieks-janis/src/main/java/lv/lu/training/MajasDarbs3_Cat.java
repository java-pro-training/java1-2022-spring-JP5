package lv.lu.training;

public class MajasDarbs3_Cat {

    private String color;
    private String name;
    private String species;
    private int age;
    private int weight;

    public MajasDarbs3_Cat(String color, String name, int weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public String getColor(){
        return color;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}