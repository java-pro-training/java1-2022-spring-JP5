package lv.lu.training.ninthlecture;

public class Employee {
    private String name;
    private double salary;
    private String company;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
        this.company = "Default company";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }
}
