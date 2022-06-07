package lv.lu.training.eighthhomework;

public class Executive extends Employee {

    double bonus;

    public Executive(String firstName, String lastName, String SSN, double salary) {
        super(firstName, lastName, SSN, salary);
    }

    void awardBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double pay() {
         double bonus = this.bonus;
         this.bonus = 0;
         return super.getSalary() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "executive employee: Employee " + super.getFirstName() + " " + super.getLastName() + " " + super.getSSN() +
                " salary plus award: $" + this.bonus;
    }
}
