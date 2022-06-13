package lv.lu.training.homework9;
import java.util.*;


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
                        "Anatomija"};

        List<String> wordList = Arrays.asList(wordArray);

        for (String word : wordList) {
            addWord(word, wordCounts);
        }
        System.out.println(wordCounts);

        for(String key: sortKeys(wordCounts)){
            System.out.println("["+key+"="+wordCounts.get(key)+"]");
        }

    }

    public static void addWord(String word, Map<String, Integer> wordMap) {
        Integer count = wordMap.get(word);
        if (count != null) {
            count++;
            wordMap.put(word, count);
        } else {
            wordMap.put(word, 1);
        }
    }
        List<String> sortKeys(Map<String,Integer> map){
            List<String> listOfKeys = new ArrayList<>(map.keySet());
            Collections.sort(listOfKeys);
            return listOfKeys;
        }
    }


