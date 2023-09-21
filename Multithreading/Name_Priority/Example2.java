package Multithreading.Name_Priority;

public class Example2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Method run. Thread name = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Example2());
        thread.start(); // Thread name = Thread-0
        thread.run(); // Thread name = main
        System.out.println("Method main. Thread name = " + Thread.currentThread().getName()); // Thread name = main
    }
}
