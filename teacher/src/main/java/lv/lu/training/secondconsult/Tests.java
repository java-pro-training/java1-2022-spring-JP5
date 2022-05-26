package lv.lu.training.secondconsult;

public class Tests {
    public static void main(String[] args) {

        //Test1
        boolean actualValue1 = SimpleCalculator.isNumbersEqual(5, 4);
        boolean expectedValue1 = false;
        char[]  asd = {'a', 'f'};
        System.out.println(String.valueOf(asd));


        if(actualValue1 == expectedValue1){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        //Test2
        if(!SimpleCalculator.isNumbersEqual(3, 7)){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        //Test3
        if(SimpleCalculator.isNumbersEqual(3, 3)){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        //Test4
        double test4 = SimpleCalculator.addNumbers(5d, 7d);
        if(test4 == 12d){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        //Test5
        double test5 = SimpleCalculator.addNumbers(8d, 8d);
        if(test5 == 16d){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}
