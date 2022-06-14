package lv.lu.training.lecture7;








public class HowManyTimes {
    public static void main(String[] args) {
        //Izveidot programmu, kas atrod cik reizes konkrētais vārds atkārtojas masīvā.
        String[] words = {"John", "Wick", "Nora", "Bumbiere", "John", "Vitautas", "Zigurds", "John", "Nora"};
        String wordToSearch = "John";
        int repeatCount = 0;
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(wordToSearch)){
                repeatCount++;
            }
        }
        System.out.println("Word [" + wordToSearch + "] is repeated [" + repeatCount + "] times");
    }
}
