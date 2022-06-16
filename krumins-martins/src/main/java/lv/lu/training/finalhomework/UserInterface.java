package lv.lu.training.finalhomework;

import java.util.Locale;
import java.util.Scanner;

public class UserInterface {

    private Bank bank;

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public static void displayMenu() {
        System.out.println(1 + ". Create account");
        System.out.println(2 + ". List all accounts");
        System.out.println(3 + ". Create transactions");
        System.out.println(4 + ". List all transactions");
        System.out.println(5 + ". List transaction for specific account");
        System.out.println(6 + ". Block account");
        System.out.println(7 + ". Unblock account");
        System.out.println("0. Quit");
    }

    public void createAccount(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        System.out.print("Enter account balance: ");
        double balance = scanner.nextDouble();
        this.bank.createAccount(accountNumber, balance, false);
        System.out.println();
    }

    public void createTransaction(Scanner scanner) {
        System.out.print("Enter credit account number: ");
        String creditAccountNumber = scanner.next();
        System.out.print("Enter debit account number: ");
        String debitAccountNumber = scanner.next();
        System.out.print("Enter transaction amount: ");
        double transactionAmount = scanner.nextDouble();
        this.bank.createTransaction(creditAccountNumber, debitAccountNumber, transactionAmount);
        System.out.println();
    }

    public void printAccountTransaction(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        this.bank.printAccountTransactions(accountNumber);
        System.out.println();
    }

    public void blockAccount(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        this.bank.blockAccount(accountNumber);
        System.out.println();
    }

    public void unblockAccount(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        this.bank.unblockAccount(accountNumber);
        System.out.println();
    }

    public void printAccounts() {
        this.bank.printAccounts();
        System.out.println();
    }

    public void printTransactions() {
        this.bank.printTransactions();
        System.out.println();
    }

    public void processUserInput() {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        boolean quit = false;
        int menuItem;

        do {
            try {
                displayMenu();
                System.out.print("Choose menu item: ");
                menuItem = scanner.nextInt();
                switch (menuItem) {
                    case 1:
                        createAccount(scanner);
                        break;
                    case 2:
                        printAccounts();
                        break;
                    case 3:
                        createTransaction(scanner);
                        break;
                    case 4:
                        printTransactions();
                        break;
                    case 5:
                        printAccountTransaction(scanner);
                        break;
                    case 6:
                        blockAccount(scanner);
                        break;
                    case 7:
                        unblockAccount(scanner);
                        break;
                    case 0:
                        quit = true;
                        System.out.println();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception exception) {
                System.out.println("Invalid input!");
                scanner.next();
            }
        } while (!quit);
    }

}
