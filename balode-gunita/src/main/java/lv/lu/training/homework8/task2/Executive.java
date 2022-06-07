package lv.lu.training.homework8.task2;

public class Executive extends Employee {

    private double bonus;

    public Executive(String firstName, String lastName, String socialSecurityNumber, double salary) {
        super(firstName, lastName, socialSecurityNumber, salary);
    }

    void awardBonus(double bonus) {
        this.bonus = bonus;
    }

    //Getter and Setter
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //Aizvietot (override) metodi pay, kur pieskaita bonusu.
    @Override
    public double pay() {
        return getSalary()+getBonus();
    }

    //toString
    @Override
    public String toString() {
        return "Executive: {" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", socialSecurityNumber='" + getSocialSecurityNumber() + '\'' +
                ", salary=" + getSalary() +
                ", bonus=" + bonus +
                '}';
    }
}
