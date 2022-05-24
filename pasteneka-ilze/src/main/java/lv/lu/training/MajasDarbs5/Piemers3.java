package lv.lu.training.MajasDarbs5;

public class Piemers3 {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("1122334455","7777",100, 200, 180);
        System.out.println(bankAccount1);
        int amount = 300;
        System.out.println("Top up for:" + amount);
        bankAccount1.topUp(amount, "7777");
    }
}
