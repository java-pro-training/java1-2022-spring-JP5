package lv.lu.training.lecture11;

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
                        "Matematika",
                        "Anatomija"};

        List<String> wordList = Arrays.asList(wordArray);

        for (String word : wordList) {
            addWord(word, wordCounts);
        }
        System.out.println(wordCounts);

        for (String key : sortKeys(wordCounts)) {
            System.out.println("[" + key + "=" + wordCounts.get(key) + "]");
        }
    }

    public void runWithScanner(){
        Map<String,Integer> wordCounts = new HashMap<>();
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Please enter line of words or type quit:");
            String line=input.nextLine();
            if(line.contains("quit"))break;
            for(String word:line.split(" ")){
                addWord(word,wordCounts);
            }
        }

        for(String word:wordCounts.keySet()){
            System.out.println(word+" = "+wordCounts.get(word));
        }

        input.close();

        for (String key : sortKeys(wordCounts)) {
            System.out.println("[" + key + "=" + wordCounts.get(key) + "]");
        }
    }

    public static void addWord(String word, Map<String, Integer> wordMap) {
        if (wordMap.get(word) != null) {
            int count = wordMap.get(word);
            count++;
            wordMap.put(word, count);
        } else {
            wordMap.put(word, 1);
        }

        // vai izmantojot ternary operatoru
        //        Integer count = wordMap.get(word);
        //        count = count != null ? count + 1 : 1;
        //        wordMap.put(word, count);
    }

    List<String> sortKeys(Map<String,Integer> map){
        List<String> listOfKeys = new ArrayList<>(map.keySet());
        Collections.sort(listOfKeys);
        return listOfKeys;
    }
}
