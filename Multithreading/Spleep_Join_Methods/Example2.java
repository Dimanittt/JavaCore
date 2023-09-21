package Multithreading.Spleep_Join_Methods;

public class Example2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread.currentTrade().getName() = " + Thread.currentThread().getName() + " i = " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread myThread1 = new Thread(new myThread1());
        Thread myThread2 = new Thread(new Example2());
        myThread1.start();
        myThread2.start();




        myThread1.join(); //try to comment this rows :)
        myThread2.join(); // when we use .join() we point that current thread should wait for another thread to end his work

        System.out.println("END!");
    }
}

class myThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread.currentTrade().getName() = " + Thread.currentThread().getName() + " i = " + i);
        }
    }
}
