package lv.lu.training.fifthhomework;

public class BankAccountUser {

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("HABBA12124351827363", 1234, 100, 200, 0);
        BankAccount bankAccount2 = new BankAccount("HABBA12124351827363", 1234, 100, 200, 180);

        // first test case
        System.out.println("Before: " + bankAccount1);
        bankAccount1.withdraw(150, 1234);
        System.out.println("After: " + bankAccount1);
        System.out.println();

        // second test case
        System.out.println("Before: " + bankAccount2);
        bankAccount2.withdraw(150, 1234);
        System.out.println("After: " + bankAccount2);
        System.out.println();

        // third test case
        System.out.println("Before: " + bankAccount2);
        bankAccount2.topUp(300, 1234);
        System.out.println("After: " + bankAccount2);
        System.out.println();

    }
}
