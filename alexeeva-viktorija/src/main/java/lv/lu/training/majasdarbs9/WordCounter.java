package lv.lu.training.majasdarbs9;

import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        new WordCounter().run();
    }

    public void run() {
        Map<String, Integer> wordCounts = new HashMap<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter line of words or type quit:");
            String line = input.nextLine();
            if (line.contains("quit")) break;
            for (String word : line.split(" ")) {
                addWord(word, wordCounts);
            }
        }
        for (String word : wordCounts.keySet()) {
            System.out.println(word + " = " + wordCounts.get(word));
        }

        input.close();

        for (String key : sortKeys(wordCounts)) {
            System.out.println("[" + key + "=" + wordCounts.get(key) + "]");
        }
    }


    private void addWord(String word, Map<String, Integer> wordMap) {
        Integer count = wordMap.get(word);
        if (count != null) {
            count++;
        } else {
            count = 1;
        }
        wordMap.put(word, count);
    }

    List<String> sortKeys(Map<String, Integer> map) {
        List<String> listOfKeys = new ArrayList<>(map.keySet());
        Collections.sort(listOfKeys);
        return listOfKeys;
    }
}




