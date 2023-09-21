package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample1 {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(2);
        arrayDeque.addLast(4);
        arrayDeque.addFirst(1);
        arrayDeque.addLast(5);
        System.out.println("arrayDeque: " + arrayDeque);
    }
}
