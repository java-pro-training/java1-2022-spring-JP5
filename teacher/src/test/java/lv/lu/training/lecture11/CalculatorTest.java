package lv.lu.training.lecture11;


import org.junit.Rule;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    @Rule
    private final Calculator victim = new Calculator(); // ar @Rule anotāciju šis mainīgais tiek izveidots katram testam atsevisķi un
    // testa beigās automātiski izdzēsts

    @BeforeAll
    static void setUpInClass(){
        System.out.println("setUpInClass in BeforeAll");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Set up in BeforeEach");
    }

    @Test
    public void shouldReturnSumOfTwoNumbers() {
        System.out.println("Test shouldReturnSumOfTwoNumbers");
        double result = victim.sum(2d, 5d);
        Assertions.assertEquals(7d, result, 0.001);
    }


    @Test
    public void shouldReturnSubtractionOfTwoNumbers() {
        System.out.println("Test shouldReturnSubtractionOfTwoNumbers");
        double result = victim.subtract(5d, 2d);
        Assertions.assertEquals(3d, result, 0.001);
    }

    @Test
    public void shouldReturnNegativeResultSubtractionOfTwoNumbers() {
        System.out.println("Test shouldReturnNegativeResultSubtractionOfTwoNumbers");
        double result = victim.subtract(5d, 7d);
        Assertions.assertNotNull(victim);
        Assertions.assertEquals(-2d, result, 0.001);
    }

    @Test
    public void shouldReturnDivideOfTwoNumbers() {
        System.out.println("Test shouldReturnDivideOfTwoNumbers");
        double result = victim.divide(10d, 5d);
        Assertions.assertEquals(2d, result, 0.001);
    }

    @Test
    public void shouldReturnDivideOfTwoNumbersWhenSecondIsZero() {
        System.out.println("Test shouldReturnDivideOfTwoNumbersWhenSecondIsZero");
        try {
            victim.divide(10d, 0d);
            throw new AssertionError("Divide method didn't throw exception");
        } catch (IllegalArgumentException exception){
            Assertions.assertTrue("Second argument can't be ZERO!".equals(exception.getMessage()));
        } catch (Exception exception){
            throw new AssertionError("Divide method didn't throw IllegalArgumentException");
        }
    }

    @AfterEach
    public void tearDown(){
        System.out.println("Tear down initiated");
    }

    @AfterAll
    static void tearDownInClass(){
        System.out.println("Tear down in class initiated");
    }
}