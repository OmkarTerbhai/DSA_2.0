package collections;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityMapDemo {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> mp = new IdentityHashMap<>();
        String s1 = new String("One");
        String s2 = new String("One");
        mp.put(s1, 1);
        mp.put(s2, 2);

        System.out.println(mp);
    }
}
