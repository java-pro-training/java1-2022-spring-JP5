package lv.lu.training.secondconsult;

public class MethodReturns {

    public static void main(String[] args) {
        int variable = getIntValue();
        double variable2 = 40d;
        boolean variable3 = isPalindrome("Name");
        char variable4 = 'A';
        long variable5 = 5;
        float variable6 = 50f;
        byte variable7 = 5;
        String variable8 = "Name";
    }

    private static int getIntValue(){
        return 5;
    }

    private static boolean isPalindrome(String name){
        return name.equals(name);
    }
}
