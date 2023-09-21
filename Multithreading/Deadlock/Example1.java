package Multithreading.Deadlock;

public class Example1 {
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {
    public void run(){
        System.out.println("Thread10: Try to get terminal of lock1");
        synchronized (Example1.lock1) {
            System.out.println("Thread10: Got terminal of lock1");
            System.out.println("Thread10: Try to get terminal of lock2");
            synchronized (Example1.lock2){
                System.out.println("Thread10: Got terminal of lock1 and lock2");
            }
        }
    }
}

class Thread20 extends Thread {
    public void run(){
        System.out.println("Thread20: Try to get terminal of lock2");
        synchronized (Example1.lock2) {
            System.out.println("Thread20: Got terminal of lock2");
            System.out.println("Thread20: Try to get terminal of lock1");
            synchronized (Example1.lock1){
                System.out.println("Thread20: Got terminal of lock1 and lock2");
            }
        }
    }
}