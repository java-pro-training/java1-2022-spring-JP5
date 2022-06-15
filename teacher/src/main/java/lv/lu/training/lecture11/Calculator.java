package lv.lu.training.lecture11;

public class Calculator {

    public Calculator(){
        System.out.println("Creating new calc object");
    }

    public double sum(double a, double b){
        return a + b;
    }

    public double subtract(double a, double b){
        return a - b;
    }

    public double divide(double a, double b){
        if(b == 0d){
            throw new IllegalArgumentException("Second argument can't be ZERO!");
        }
        return a / b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public double mod(double a, double b){
        return a % b;
    }
}
