package lv.lu.training.lecture9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> tableOfContents = new HashMap<>();
        tableOfContents.put("Introduction", 3);
        tableOfContents.put("Chapter 1", 15);
        tableOfContents.put("Chapter 2", 48);
        System.out.println(tableOfContents);

        Set<String> cities = new HashSet<>();
        cities.add("Riga");
        cities.add("Ogre");
        System.out.println("cities = " + cities);

    }
}
