package by.vpshulga.lesson16;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Task03 {
    static void sumOfValuesOfMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("123", 12);
        map.put("12345", 18);
        map.put("12345678", 1);
        map.put("123456", 112);
        map.put("12", 13);
        map.put("123456789", 10);
        map.put("0123", 1);
        map.put("0456789012", 4);
        map.put("1", 48);
        map.put("0", 69);

        int sum =  map.entrySet().stream()
                .filter(es-> es.getKey().length() < 7)
                .mapToInt(Entry::getValue)
                .sum();
        System.out.println(sum);
    }
}
