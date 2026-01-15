package collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        System.out.println("Sorted Map Demo");

        SortedMap<Integer,String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println(map.headMap(2));
        System.out.println(map.tailMap(2));
    }
}
