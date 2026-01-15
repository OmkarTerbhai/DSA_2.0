package collections;


import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;

public class ConcurrentMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer, String> map = new ConcurrentSkipListMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(4, "Four");

//        System.out.println(map.floorEntry(2));
//        System.out.println(map.ceilingEntry(3));

        System.out.println(map.tailMap(2));
        System.out.println(map.headMap(2));

        System.out.println(map);
    }
}
