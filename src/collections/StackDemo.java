package collections;

import java.util.Arrays;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(11);
        st.push(21);
        st.push(31);

        System.out.println(st);

        st.pop();
        st.push(61);
        System.out.println(st.peek());
        System.out.println(st);

    }
}
