package lv.lu.training;

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
    public void setColor(String color) {
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    // O.L. Ir labi, vienīgi nav izveidotas getter un setter metodes mainīgajiem species un age.
}
