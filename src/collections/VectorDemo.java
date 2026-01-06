package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        List<String> strList = new Vector<>();

        strList.addAll(Arrays.asList("Demo", "Hello", "Memo", "Fun"));

        System.out.println(strList);
        List<Integer> li = new Vector<>();
        Thread t1 = new Thread(() -> {
            for(int i = 1; i <= 1000; i++) {
                li.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 1001; i <= 2000; i++) {
                li.add(i);
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (Exception ignored) {}

        System.out.println(li.size());
    }
}
