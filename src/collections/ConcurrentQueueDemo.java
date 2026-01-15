package collections;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentQueueDemo {

    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

        queue.add(21);
        queue.add(34);

        System.out.println(queue);
    }
}
