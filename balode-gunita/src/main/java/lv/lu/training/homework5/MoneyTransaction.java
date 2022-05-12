package lv.lu.training.homework5;

public class MoneyTransaction {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("11112222", "1234", 100, 200, 180);
        //GB: Konstruktora un seit nenoradu "amount", tacu izdruka paradas "amount 0.0" - kads ir iemesls?

        System.out.println("My account statement - opening balance: " +myAccount);

        //GB: My account statement: lv.lu.training.homework5.BankAccount@30f39991 --> @Override

        myAccount.withdraw(200, "1234");
        System.out.println("My account statement - closing balance: " +myAccount);

        myAccount.topup(300, "1234");
        System.out.println("My account statement - closing balance: " +myAccount);

    }
}
