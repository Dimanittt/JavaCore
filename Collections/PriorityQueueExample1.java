package Collections;

import java.util.PriorityQueue;

public class PriorityQueueExample1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(4);
        priorityQueue.offer(10);
        priorityQueue.offer(1);
        priorityQueue.offer(7);
        priorityQueue.offer(8);

        System.out.println("priorityQueue: " + priorityQueue);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}


