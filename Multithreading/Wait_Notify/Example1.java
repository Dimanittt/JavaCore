package Multithreading.Wait_Notify;

public class Example1 {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }

}

class Market {
    private final Object lock = new Object();
    private int breadCount = 0;

    public void getBread() {
        synchronized (lock){
            while (breadCount < 1) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount--;
            System.out.println("Take");
            System.out.println("breadCount = " + breadCount);
            lock.notify();
        }
    }

    public void putBread() {
        synchronized(lock) {
            while (breadCount >= 5){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            breadCount++;
            System.out.println("Put");
            System.out.println("breadCount = " + breadCount);
            lock.notify();
        }
    }
}

class Producer implements Runnable {

    Market market;

    Producer(Market market){
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {

    Market market;

    Consumer(Market market){
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}
