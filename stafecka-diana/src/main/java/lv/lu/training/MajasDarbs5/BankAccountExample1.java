package lv.lu.training.MajasDarbs5;

public class BankAccountExample1 {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(55555, "1234", 100, 200,0);
        System.out.println("X"+myAccount);

        myAccount.withdraw(150, "1234");
        System.out.println("Pampampam - closing balance: " +myAccount);

        myAccount.topUp(300, "4444" );
        System.out.println("Lalala - closing balance: " +myAccount);

    }
}
