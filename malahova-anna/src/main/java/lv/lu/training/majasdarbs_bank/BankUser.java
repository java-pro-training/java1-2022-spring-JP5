package lv.lu.training.majasdarbs_bank;

public class BankUser {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("11112222", "1234", 100, 200, 180);

        System.out.println("My account " +myAccount);

        //GB: My account statement: lv.lu.training.homework5.BankAccount@30f39991 --> @Override

        myAccount.withdraw(200, "1234");
        System.out.println("My account balance: " +myAccount);

        myAccount.topup(300, "1234");
        System.out.println("My account balance: " +myAccount);



    }

}
