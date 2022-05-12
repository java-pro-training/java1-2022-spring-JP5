package lv.lu.training;

public class Theatre {

    private String name ;

    private int sinceyear;

    private int capacity;

    private String type ;

    private String city ;

    private int employees;

    public Theatre() { //CTRL+ ALT
    }

    public Theatre(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSinceyear() {
        return sinceyear;
    }

    public void setSinceyear(int sinceyear) {
        this.sinceyear = sinceyear;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }
}
