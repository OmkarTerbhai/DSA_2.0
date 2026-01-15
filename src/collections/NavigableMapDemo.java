package collections;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(4, "Three");

        System.out.println(map.ceilingKey(3));
        System.out.println(map.floorKey(3));
    }
}
