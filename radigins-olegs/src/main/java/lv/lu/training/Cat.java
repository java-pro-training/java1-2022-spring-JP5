package lv.lu.training;

public class Cat {
    private String color;
    private String name;
    private String species;
    private int age;
    private int weight;



    public Cat(String color, String name, String species, int age, int weight) {
        this.color = color;
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
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

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;

    }

    // O.L. Ļoti labi, vienīgi uzdevuma nosacījumos bija definēts, ka konstruktoram ir jābūt ar 3 argumentiem.
    // Un tad, kad objekts izveidots, tad izsaukt settter metodes species un age mainīgajiem
}


