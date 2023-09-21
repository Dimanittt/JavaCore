package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Dmitry");
        queue.offer("Olesya");
        queue.offer("Georgy");
        queue.offer("Kolya");
        queue.offer("Kseniya");
        System.out.println("queue: " + queue);
        System.out.println("queue.poll(): " + queue.poll());
        System.out.println("queue: " + queue);
        System.out.println("queue.element() cast exceptions, queue.element(): " + queue.element());
        System.out.println("queue.peek() does not cast exceptions, queue.peek(): " + queue.element());
        System.out.println("Do not remove elements form the middle of the queue");
    }
}
