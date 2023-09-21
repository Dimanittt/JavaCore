package Multithreading.threadSafeCollections;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueExample {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue(4);

        //Producer
        new Thread(() -> {
            int i = 0;
            while(true){
                try {
                    arrayBlockingQueue.put(++i);
                    System.out.println("Produce " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(() -> {
            while(true){
                try {
                    int j = arrayBlockingQueue.take();
                    System.out.println("Consume " + j);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();


        System.out.println(arrayBlockingQueue);
    }
}
