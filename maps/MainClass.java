package maps;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("one", 1);
        numbers.put("one", 2);
        numbers.putIfAbsent("one", 3);
        System.out.println(numbers.get("one"));
        System.out.println(numbers.keySet());
        System.out.println(numbers.values());
        System.out.println(numbers.entrySet());
        System.out.println(numbers.getOrDefault("one",2));
        numbers.replace("one",11);
        numbers.replace("one",11,22);
//        System.out.println(numbers);
//
//
////        Set<Entry<String,Integer>> entries=numbers.entrySet();
//        for(Entry<String,Integer> entry: numbers.entrySet()){
//            entry.setValue(entry.getValue()*100);
//        }
        System.out.println(numbers);
    }

}
