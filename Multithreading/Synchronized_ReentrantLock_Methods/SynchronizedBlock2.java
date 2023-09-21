package Multithreading.Synchronized_ReentrantLock_Methods;

public class SynchronizedBlock2 {
    volatile static int counter;
    static void increment(){
        synchronized (SynchronizedBlock2.class){
            counter++;
        }
    }


    public static void main(String[] args) throws InterruptedException {


        Thread thread1 = new Thread(new myRunnableImpl2());
        thread1.start();
        Thread thread2 = new Thread(new myRunnableImpl2());
        thread2.start();
        Thread thread3 = new Thread(new myRunnableImpl2());
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println();
        System.out.println(counter);

    }
}



class myRunnableImpl2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            SynchronizedBlock2.increment();
        }
    }
}

