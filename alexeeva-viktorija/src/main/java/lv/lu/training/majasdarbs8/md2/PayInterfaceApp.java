package lv.lu.training.majasdarbs8.md2;

public class PayInterfaceApp {
    public static void main(String[] args) {

        Payable[] payableObjects = new Payable[5];

        payableObjects[0] = new SalariedEmployee("John", "Smith", "11111", 800d);
        payableObjects[1] = new SalariedEmployee("Lissa", "Barnes", "22222", 1200d);
        payableObjects[2] = new HourlyEmployee("Barn", "Nobles","33333", 120, 15d);
        payableObjects[3] = new HourlyEmployee("Scott", "Tiger","44444", 144, 14d);
        payableObjects[4] = new Executive("Anna", "Smith", "55555",1400d,1000d);

        for (Payable currentPayable:
             payableObjects) {
            if (currentPayable != null) {
                System.out.println(currentPayable + "payment due = " + currentPayable.pay());
            }
        }




    }
}
