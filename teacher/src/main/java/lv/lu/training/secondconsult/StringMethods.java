package lv.lu.training.secondconsult;

public class StringMethods {
    public static void main(String[] args) {
        String name = "AtKSkaJkaajMNF";
        char[] array = name.toLowerCase().toCharArray();
        for (char burts : array){
            System.out.print(burts + " ");
        }
    }
}
