package lv.lu.training.nodarbiba7;

public class HowManyTimes {
    public static void main(String[] args) {

        String[] words = {"John", "Wick", "Nora", "Bumbiere", "John", "Vitautas", "Zigurds", "John", "Nora"};
        String wordToSearch = "Janis";
        int repeatCount = 0;
        for (int i = 0; i < words.length; i++){
            if (words[i].equals(wordToSearch)) {
                repeatCount ++;
            }
        }
        System.out.println("Word [" + wordToSearch + "] is repeated [" + repeatCount + "] times");
    }

}
