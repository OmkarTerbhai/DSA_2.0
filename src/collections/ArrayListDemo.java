package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        /**
         * List Interface has an implementation `ArrayList`.
         */
        List<Integer> intList = new ArrayList<>();

        /**
         * Adding elements to an `ArrayList`.
         */
        intList.add(21);
        intList.add(11);
        intList.add(31);
        intList.add(1, 19);
        intList.addAll(Arrays.asList(41, 51, 61, 2));

        //Printing the arraylist using the toString() implementation
        System.out.println("Initial List: " + intList);

        intList.remove(Integer.valueOf(2));

        System.out.println("After Object removal: " + intList);

        intList.addFirst(1);
        intList.addLast(71);

        System.out.println("After adding at first and at last: " + intList);

        intList.removeFirst();
        intList.removeLast();

        System.out.println("After removing at first and at last: " + intList);
    }
}
