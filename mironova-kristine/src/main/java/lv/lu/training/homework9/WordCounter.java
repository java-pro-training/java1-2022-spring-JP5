package lv.lu.training.homework9;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WordCounter {
    public static void main(String[] args) {
        new WordCounter().run();
    }

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
    }

    public static void addWord(String word, Map<String, Integer> wordMap) {
        if(wordMap.get(word) != null) {
            int count = wordMap.get(word);
            count++;
            wordMap.put(word, count);
        } else {
            wordMap.put(word, 1);
        }
    }
}



