package lv.lu.training.lecture7;

public class MessageMain {
    public static void main(String[] args) {

        System.out.println("Created = " + Message.instancesCreated);
        Message greeting = new Message("Hi!");
        Message question = new Message("How are you?");
        Message farewell = new Message("Goodbye!");
        System.out.println("Created = " + Message.instancesCreated);

    }
}
