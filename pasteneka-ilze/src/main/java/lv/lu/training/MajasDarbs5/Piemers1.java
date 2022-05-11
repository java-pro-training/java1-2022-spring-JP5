package lv.lu.training.MajasDarbs5;

public class Piemers1 {
    public static void main(String[] args) {
        BankAccount bankaccount2 = new BankAccount("1234321", "6666",100, 200, 0);
        System.out.println(bankaccount2);
        int availableAmount = bankaccount2.getDebitLimit() + (bankaccount2.getCreditLimit() - bankaccount2.getUsedCreditLimit());
        int amount2 = 150;
        System.out.println("Available amount: " + availableAmount);
        System.out.println("Withdraw:" + amount2);
        bankaccount2.withDraw(amount2,"6666");
    }
}
