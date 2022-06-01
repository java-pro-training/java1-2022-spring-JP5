package lv.lu.training.ninthhomework;

import java.util.*;

public class WordCounter {

    static Map<String,Integer> wordCounts = new HashMap<>();

    public static void addWord(String word, Map<String, Integer> wordMap) {

        int wordCount = 0;
        if (wordMap.get(word) != null) {
            wordCount = wordMap.get(word);
        }
        wordCounts.put(word,  wordCount + 1);
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
    }

    static void alternativeRun(){

        String[] wordArray = new String[]
                {"Zoologija",
                "Matematika",
                "Zoologija",
                "Literatura",
                "Matematika"};

        List<String> wordList = Arrays.asList(wordArray);

        for(String word:wordList){
            addWord(word, wordCounts);
        }
        System.out.println(wordCounts);
    }


    public static void main(String[] args) {
        run();
        wordCounts.clear();
        alternativeRun();

        /*
         * Rezultāts:
         *   Please enter line of words or type quit:
         *   Zoologija Matematika Zoologija Literatura Matematika
         *   Please enter line of words or type quit:
         *   quit
         *   Matematika = 2
         *   Zoologija = 2
         *   Literatura = 1
         *   {Matematika=2, Zoologija=2, Literatura=1}
         */
    }

}
