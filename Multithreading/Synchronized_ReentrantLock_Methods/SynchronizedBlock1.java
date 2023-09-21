package Multithreading.Synchronized_ReentrantLock_Methods;

public class SynchronizedBlock1 {
    public static void main(String[] args) throws InterruptedException {

        myRunnableImpl1 runnable = new myRunnableImpl1();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

//        Thread thread1 = new Thread(new myRunnableImpl1());
//        Thread thread2 = new Thread(new myRunnableImpl1());
//        Thread thread3 = new Thread(new myRunnableImpl1());

        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println();
        System.out.println(Counter1.count);
    }
}

class Counter1 {
    volatile static int count = 0; //volatile is useless here if its not used with synchronized
}

class myRunnableImpl1 implements Runnable {


    private void doWork1(){ //in order to avoid Data race we use !synchronized!
         synchronized(this){
             Counter1.count++;
             System.out.println(Counter1.count);
         }
    }


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}
