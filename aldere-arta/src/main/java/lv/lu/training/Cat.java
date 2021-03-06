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

    //O.L. Viss labi. Triviāls komentārs - labā prakse, ka starp metodēm ir papildus tukša rindiņa.
    // Lekcijā es to neminēju, tāpēc nav liela bēda, ja tas netiek darīts.
    // To var arī nodrošināt ar taustiņu kombināciju CTRL+ALT+L
}
