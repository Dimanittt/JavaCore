package Multithreading.Synchronized_ReentrantLock_Methods;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {

//        Runnable r = () -> {
//                for (int i = 0; i < 10000; i++) {
//                    myRunnableImpl.increment();
//                }
//        };

        Thread thread1 = new Thread(new myRunnableImpl());
        thread1.start();
        Thread thread2 = new Thread(new myRunnableImpl());
        thread2.start();
        Thread thread3 = new Thread(new myRunnableImpl());
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println();
        System.out.println(Counter.count);

    }
}

class Counter {
    volatile static int count = 0; //volatile is useless here if its not used with synchronized
}

class myRunnableImpl implements Runnable {

     synchronized static void increment(){ //in order to avoid Data race we use !synchronized!
        Counter.count++;
        System.out.print(Counter.count + " ");
    }


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            increment();
        }
    }
}
