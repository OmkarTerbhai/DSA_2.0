package collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(21);
        queue.add(31);
        queue.add(41);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
