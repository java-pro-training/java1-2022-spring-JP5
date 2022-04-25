package lv.lu.training.nodarbiba4;

public class QuickMathsTest {
    public void test1() {
        QuickMath victim = new QuickMath();
        int a = 3;
        int b = 5;
        int expectedResult = 3;
        int actualResult = victim.max(a,b);
        check(actualResult, expectedResult, "test1");
    }

    public void check(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed ");
        } else {
            System.out.println(testName + " failed ");
            System.out.println(" expected " + expectedResult + " but was " + actualResult);
        }
    }
}
