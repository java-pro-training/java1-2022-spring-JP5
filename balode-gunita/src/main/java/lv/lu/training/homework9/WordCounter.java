package lv.lu.training.homework9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        //Izsaukt run metodi
        new WordCounter().run();
    }

        public void run () {
            Map<String, Integer> wordCounts = new HashMap<>();
            Scanner input = new Scanner(System.in);
            while (true) {
                System.out.println("Please enter line of words or type quit: ");
                String line = input.nextLine();
                if (line.contains("quit")) break;
                for (String word: line.split(" ")) {
                    addWord (word, wordCounts);
                }
            }

            for (String word: wordCounts.keySet()) {
                System.out.println(word+ " = " +wordCounts.get(word));
            }

            input.close();
        }

        public static void addWord (String word, Map<String, Integer> wordMap) {
            Integer count = wordMap.get(word);      //vertibas pieskirsana
            if (count != null){                     //ja ir vertiba, tad pieskaita +1
                count++;
            } else {
                count = 1;                          //ja nav vertiba, tad vertiba tiek pieskirta 1
            }
            wordMap.put(word, count);
        }

}
