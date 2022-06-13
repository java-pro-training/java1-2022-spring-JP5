package lv.lu.training;

import java.util.HashMap;
import java.util.Map;

public class HelloWorld {

    public static void main(String[] args) {
        boolean vertiba1 = false;
        boolean vertiba2 = true;
        System.out.println( vertiba1);
        System.out.println( vertiba2);
        System.out.println( !vertiba1);
        System.out.println( !vertiba2);

        Map<String, Integer> map = new HashMap<>();
        System.out.println();
        map.put("Life", 1);
        if(map.get("Life") == null){
            map.put("Life", 1);
        } else {
            map.put("Life", 2);
        }
        System.out.println(map);
    }
}
