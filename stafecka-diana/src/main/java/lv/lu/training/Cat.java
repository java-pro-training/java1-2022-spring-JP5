package lv.lu.training;

public class Cat {
    private String color;
    private String name;
    private String species;
    private int age;
    private int weight;
    private int gender;

    public Cat(String color, String name, int weight, String species, int age) {
        this.color = color;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
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

    // O.L. Ļoti labi, vienīgi uzdevuma nosacījumos bija definēts, ka konstruktoram ir jābūt ar 3 argumentiem.
    // Un tad, kad objekts izveidots, tad izsaukt settter metodes species un age mainīgajiem
}
