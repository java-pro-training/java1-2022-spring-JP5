package lv.lu.training.homework9;

import java.util.*;

public class WordCounterSorted {

    public static void main(String[] args) {
        //Izsaukt run metodi
        new WordCounterSorted().run();
    }

    //Run metode tiek izsaukta no main metodes:
    void run() {
        Map<String, Integer> wordCounts = new HashMap<>();
        String[] wordArray = new String[]
                {"Zoologija",
                        "Matematika",
                        "Zoologija",
                        "Literatura",
                        "Matematika"};

        List<String> wordList = Arrays.asList(wordArray);

        for (String word : wordList) {
            addWord(word, wordCounts);
        }
        System.out.println(wordCounts);

        //Sakartotais saraksts:
        for (String key : sortKeys(wordCounts)) {
            System.out.println("[" + key + "=" + wordCounts.get(key) + "]");
        }
    }

    public static void addWord (String word, Map<String, Integer> wordMap) {
        Integer count = wordMap.get(word);
        if (count != null){
            count++;
        } else {
            count = 1;
        }
        wordMap.put(word, count);
    }

    //Metode, kas atdos pec atslegas sakartotu sarakstu augosa seciba (pec noklusejuma String bus alfabetiska seciba):
    List<String> sortKeys(Map<String,Integer> map){
        List<String> listOfKeys = new ArrayList<>(map.keySet());
        Collections.sort(listOfKeys);
        return listOfKeys;
    }

}
