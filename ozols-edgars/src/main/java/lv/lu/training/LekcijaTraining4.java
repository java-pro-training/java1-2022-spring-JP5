package lv.lu.training;

public class LekcijaTraining4 {
    public static void main(String[] args) {

        int age = 5;

        switch (age){
            case 5:
            case 6:
                System.out.println("Age 5 or 6");
                break;
            case 10:
                    System.out.println("Age  10");
                    break;
            default:
                System.out.println("Age not found");
        }
    }
}
