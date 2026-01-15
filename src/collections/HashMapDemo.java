package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();

        mp.put("One", 1);

        Map<String, Integer> mp2 = Collections.unmodifiableMap(mp);
        mp.put("One", 2);

        Map<Integer, Integer> mp3 = Map.ofEntries(Map.entry(1, 3));

        System.out.println(mp);
        System.out.println(mp2);
        System.out.println(mp3);
    }
}
