package lv.lu.training.majasdarbs8.md2;

import java.util.Objects;

public class Executive extends Employee {

    protected double bonus;

    public Executive(String firstName, String lastName, String socialSecurityNumber, double salary, double bonus) {
        super(firstName, lastName, socialSecurityNumber, salary);
        this.bonus = bonus;
    }

    public double awardBonus() {
        return bonus;
    }

    @Override
    public double pay(){
        double salary = getSalary() + getBonus();
        setBonus(0);
        return salary;

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Executive{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", socialSecurityNumber='" + getSocialSecurityNumber() + '\'' +
                ", salary=" + getSalary() +
                ", bonus=" + bonus +
                ", awardBonus=" + awardBonus() +
                ", pay=" + pay() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Executive)) return false;
        if (!super.equals(o)) return false;
        Executive executive = (Executive) o;
        return Double.compare(executive.getBonus(), getBonus()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBonus());
    }
}
