package lv.lu.training.Lekcija5;

public class AccountTransactions {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(
                "LV55UNLA5555555555",
                "4556",
                100d,
                200d,
                180d);

        myAccount.topUp("4556", 300d);
        System.out.println(myAccount);
    }
}
