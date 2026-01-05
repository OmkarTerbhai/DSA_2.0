package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(12);
        linkedList.add(24);
        linkedList.add(1, 11);
        linkedList.addLast(19);

        System.out.println(linkedList);

        ListIterator<Integer> it = linkedList.listIterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " --> ");
        }
        System.out.println();
        linkedList.removeFirst();

        System.out.println(linkedList);
    }
}
