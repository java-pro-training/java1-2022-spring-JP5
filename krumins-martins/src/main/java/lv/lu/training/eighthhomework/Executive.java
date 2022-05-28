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
        return super.getSalary() + this.bonus;
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
                " salary plus award: $" + this.bonus; // salary plus award =  : $1,000.00 nav pareizi no loģikas viedokļa,
                                                      // tas ir tikai award
    }
}
