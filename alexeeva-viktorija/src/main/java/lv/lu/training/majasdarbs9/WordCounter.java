package lv.lu.training.majasdarbs9;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {

    }

    Map<String, Integer> wordCounts = new HashMap<>();

    public void run() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter line of words or type quit:");
            String line = input.nextLine();
            if (line.contains("quit")) break;
            for (String word : line.split(" ")) {
                addWord(new String[]{word}, wordCounts);
            }
        }
        for (String word : wordCounts.keySet()) {
            System.out.println(word + " = " + wordCounts.get(word));
        }

        input.close();
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

    public static void addWord(String[] word, Map<String, Integer> wordCounts) {

        int i = 0;
        if(word[i].equals(word[i+1])) {
            i++;
            System.out.println("Word" + word[i] + "was mentioned" + i + "times");
        }


    }
}
