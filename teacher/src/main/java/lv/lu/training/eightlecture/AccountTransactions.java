package lv.lu.training.eightlecture;

public class AccountTransactions {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(
                "LVHABA06738495",
                "1345",
                100d,
                200d,
                180d);

        myAccount.topUp("1345", 300d);
        System.out.println(myAccount);

    }
}
