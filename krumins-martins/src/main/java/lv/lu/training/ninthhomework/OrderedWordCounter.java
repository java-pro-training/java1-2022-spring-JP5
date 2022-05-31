package lv.lu.training.ninthhomework;

import java.util.*;

public class OrderedWordCounter {

    static Map<String,Integer> wordCounts = new HashMap<>();

    static void addWord(String word, Map<String, Integer> wordMap) {

        int wordCount = 0;
        if (wordMap.get(word) != null) {
            wordCount = wordMap.get(word);
        }
        wordCounts.put(word,  wordCount + 1);
    }

    static List<String> sortByKey(Map<String,Integer> map){
        List<String> listOfKeys = new ArrayList<>(map.keySet());
        Collections.sort(listOfKeys);
        return listOfKeys;
    }


    public static void run(){
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Please enter line of words or type quit:");
            String line=input.nextLine();
            if(line.contains("quit"))break;
            for(String word:line.split(" ")){
                addWord(word, wordCounts);
            }
        }

        for(String word:wordCounts.keySet()){
            System.out.println(word + " = " + wordCounts.get(word));
        }
        input.close();


        for(String key: sortByKey(wordCounts)){
            System.out.println("[" + key + "=" + wordCounts.get(key) + "]");
        }
    }

    public static void main(String[] args) {
        run();
        /*
         * Rezultāts:
         *   Please enter line of words or type quit:
         *   Zoologija Matematika Zoologija Literatura Matematika Zoologija
         *   Please enter line of words or type quit:
         *   quit
         *   Matematika = 2
         *   Zoologija = 3
         *   Literatura = 1
         *   [Literatura=1]
         *   [Matematika=2]
         *   [Zoologija=3]
         */
    }

}
