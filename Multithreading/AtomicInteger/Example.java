package Multithreading.AtomicInteger;

import java.util.concurrent.Exchanger;
import java.util.concurrent.atomic.AtomicInteger;

public class Example {
//    public static int count = 0;
    public static AtomicInteger count = new AtomicInteger(0);


    public static void increment(){
//        count++;
        count.addAndGet(5);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImpl());
        Thread thread2 = new Thread(new MyRunnableImpl());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(count);

    }
}

class MyRunnableImpl implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            Example.increment();
        }
    }
}