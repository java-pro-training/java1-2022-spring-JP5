package lv.lu.training.lecture9;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        String[] scaryStoriesArray = new String[2];
        scaryStoriesArray[0] = "Your browser history is public";
        scaryStoriesArray[1] = "You didn't kill that spider";
        for (String story : scaryStoriesArray) {
            System.out.println(story);
        }

        List<String> scaryStories = new ArrayList<>();
        scaryStories.add("Your browser history is public");
        scaryStories.add("You didn't kill that spider");

        for (String story : scaryStories) {
            System.out.println(story);
        }
    }
}
