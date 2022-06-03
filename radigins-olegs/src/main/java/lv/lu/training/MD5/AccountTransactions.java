package lv.lu.training.MD5;

public class AccountTransactions {
    public static void main(String[] args) {
        BankAccount myAccont = new BankAccount("LV53HABA1235460111", "1234", 100, 200, 0);
        myAccont.withdraw("1234", 150);
        System.out.println(myAccont);
        myAccont.topUp("1234", 200);
        System.out.println(myAccont);
        myAccont.withdraw("12345", 200);
        System.out.println(myAccont);
        myAccont.withdraw("1234", 500);
        System.out.println(myAccont);
    }
}
