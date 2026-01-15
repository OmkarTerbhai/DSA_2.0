package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deq = new ArrayDeque<>();

        deq.addFirst(21);
        deq.addLast(31);
        deq.add(11);

        deq.pollLast();

        System.out.println(deq);
    }
}
