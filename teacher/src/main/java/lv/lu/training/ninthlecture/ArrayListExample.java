package lv.lu.training.ninthlecture;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Peter");

        System.out.println(names);
        System.out.println(names.size());


        names.add("Bruce");

        System.out.println(names);
        System.out.println(names.size());

        for (String name : names) {
            System.out.println(name);
        }

        Set<String> latvianCities = new HashSet<>();
        latvianCities.add("Cesis");
        latvianCities.add("Kuldiga");
        latvianCities.add("Valmiera");
        System.out.println( "Latvian cities: " + latvianCities);

        Set<String> lithuanianCities = new HashSet<>();
        lithuanianCities.add("Kaunas");
        lithuanianCities.add("Vilnius");
        System.out.println( "Lithuanian cities:" + lithuanianCities);

        Set<String> balticCities = new HashSet<>();
        balticCities.addAll(latvianCities);
        balticCities.addAll(lithuanianCities);
        balticCities.add("Tartu");

        System.out.println( "Baltic cities: " + balticCities);
        for (String city : balticCities) {
            System.out.println(city);
        }


        Map<String, Employee> salaryMap = new HashMap<>();
        salaryMap.put("John", new Employee("John", 1400d));
        salaryMap.put("James", new Employee("James", 1400d));
        salaryMap.put("Peter", new Employee("Peter", 1400d));

        System.out.println(salaryMap);
        System.out.println("Entry set:");
        System.out.println(salaryMap.entrySet());
        System.out.println("Key set:");
        System.out.println(salaryMap.keySet());
        System.out.println("Values:");
        System.out.println(salaryMap.values());


        for( Map.Entry<String, Employee> entry : salaryMap.entrySet()){
            System.out.println("Key: " + entry.getKey());
            System.out.println("Values: " + entry.getValue());
        }

        for( String key : salaryMap.keySet()){
            System.out.println("Key when iterating trough keyset: " + key);
        }

        for( Employee employee : salaryMap.values()){
            System.out.println("Employee :" + employee);
        }




    }
}
