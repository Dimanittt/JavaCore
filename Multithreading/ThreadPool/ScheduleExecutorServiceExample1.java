package Multithreading.ThreadPool;

import java.util.concurrent.*;

public class ScheduleExecutorServiceExample1 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);
        for (int i = 0; i < 10; i++) {
            scheduledExecutorService.schedule(new RunnableImnp200(), 5, TimeUnit.SECONDS);
        }

//        scheduledExecutorService.schedule(new RunnableImnp200(), 5, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImnp200(), 1, 1, TimeUnit.SECONDS);
        Thread.sleep(10000);
        scheduledExecutorService.shutdown();

        ExecutorService executorService = Executors.newCachedThreadPool(); //создает потоки по мере надобности и удаляет их каждый спустя 60 секунд без использования конкретного потока

    }
}

class RunnableImnp200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends");
    }
}