package collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingDeque<Integer> deq = new LinkedBlockingDeque<>(2);

        deq.add(21);
        deq.add(31);
        deq.add(41);

        deq.offerFirst(11);
        deq.pollLast();

        System.out.println(deq);
    }
}
