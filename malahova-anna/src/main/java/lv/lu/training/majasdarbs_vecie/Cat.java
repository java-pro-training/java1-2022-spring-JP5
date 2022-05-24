package lv.lu.training.majasdarbs_vecie;

public class Cat {

        private String color;
        private String name;
        private String species;
        private int age;
        private int weight;

    public Cat(String color, String name, int weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

