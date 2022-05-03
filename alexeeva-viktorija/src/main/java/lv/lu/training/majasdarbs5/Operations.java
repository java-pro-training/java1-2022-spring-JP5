package lv.lu.training.majasdarbs5;


public class Operations {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("987654321", "1234", 100, 200, 50);


        myAccount.topUp(30, "1234");
        System.out.println("Current Balance is " + myAccount);

        myAccount.withDraw(150, "1234");
        System.out.println("Current Balance is " + myAccount);

        myAccount.withDraw(180, "1234");
        System.out.println("Current Balance is " + myAccount);

        myAccount.topUp(80, "1122");
        System.out.println("Current Balance is " + myAccount);
    }
}
