package lv.lu.training;


public class QuickMathTest {
    public void test1(){
        QuickMath victim = new QuickMath();
        int a = 3;
        int b = 5;
        int exeptedResult = 5;
        int actualResult = victim.max(a,b);
        check(actualResult,exeptedResult,"Test1");

    }

    public void check(int actualResult, int exeptedResult, String testName) {
        if (actualResult == exeptedResult){
            System.out.println(testName + "has past!");
        }else{
            System.out.println(testName + "has failed!");
            System.out.println("Expected" + exeptedResult + "but was" + actualResult);
        }
    }

}
