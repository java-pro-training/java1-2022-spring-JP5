package lv.lu.training.homework8.task2;

public class PayInterfaceApp {

    public static void main(String[] args) {

        Payable[] payableObjects = new Payable[5];

        payableObjects[0] = new SalariedEmployee("John", "Smith", "1111", 800.00);
        payableObjects[1] = new SalariedEmployee("Lisa", "Barnes", "2222", 1200.00);

        payableObjects[2] = new HourlyEmployee("Barn", "Nobles", "3333", 15.0);
        ((HourlyEmployee) payableObjects[2]).addHours(120);
        payableObjects[3] = new HourlyEmployee("Scott", "Tiger", "4444", 14.0);
        ((HourlyEmployee) payableObjects[3]).addHours(144);

        payableObjects[4] = new Executive("Mark", "Junior", "5555", 1400d);
        ((Executive) payableObjects[4]).awardBonus(1000);

        for (Payable currentPayable : payableObjects) {
            if (currentPayable != null) {
                System.out.println("" +currentPayable + " payment due = " +currentPayable.pay());
            }
        }

    }

}
