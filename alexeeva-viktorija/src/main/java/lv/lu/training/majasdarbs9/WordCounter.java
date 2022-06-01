package lv.lu.training.majasdarbs9;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {

    }
//
    Map<String, Integer> wordCounts = new HashMap<>();
//    wordCounts.put("Word1",i);
//    wordCounts.put("Word2",i);
//    wordCounts.put("Word3",i);


    public void run() {
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
    }

    private void addWord(String word, Map<String, Integer> wordCounts) {
        Scanner newWord = new Scanner(System.in);
        String[] wordArray = new String[5];
        wordArray[0] = newWord.nextLine();
        wordArray[1] = newWord.nextLine();
        wordArray[2] = newWord.nextLine();
        wordArray[3] = newWord.nextLine();
        wordArray[4] = newWord.nextLine();


        int i = 0;
        if(wordArray[i].equals(wordArray[i+1])) {
            i++;
            System.out.println("Word" + wordArray[i] + "was mentioned" + i + "times");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WordCounter)) return false;
        WordCounter that = (WordCounter) o;
        return Objects.equals(wordCounts, that.wordCounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wordCounts);
    }

    }

