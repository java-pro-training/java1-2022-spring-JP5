package lv.lu.training.lecture10.lecture;

public class ExceptionsExample {
    public static void main(String[] args) throws NullPointerException {
        String[] names = {"John", "Peter", "Maria"};
//        System.out.println(names[4]);
//        throw new NullPointerException("Hello world!");
//        throwException();
//        System.out.println("Hello world");
        String emptyString = null;
        emptyString.isEmpty();

    }

    private static void throwException() throws NullPointerException {
        throw new NullPointerException("Hello world!");
    }
}
