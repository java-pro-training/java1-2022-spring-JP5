package lv.lu.training.finalhomework;

public class TestUserInterface {

    public static void main(String[] args) {
        Bank bank = new Bank();
        UserInterface userInterface = new UserInterface();

        // sagatavo test datu kopu
        bank.createAccount("HABA17LV000000000001", 100, false);
        bank.createAccount("HABA17LV000000000002", 200, false);
        bank.createAccount("HABA17LV000000000003", 500, false);
        bank.createAccount("HABA17LV000000000004", 1000, false);
        bank.createTransaction("HABA17LV000000000001", "HABA17LV000000000002", 1);
        bank.createTransaction("HABA17LV000000000002", "HABA17LV000000000003", 1);
        bank.createTransaction("HABA17LV000000000004", "HABA17LV000000000003", 1);

        userInterface.setBank(bank);
        userInterface.processUserInput();

    }
}
