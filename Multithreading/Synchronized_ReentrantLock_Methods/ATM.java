package Multithreading.Synchronized_ReentrantLock_Methods;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class ATM {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Dmitry", lock);
        new Employee("Olesya", lock);
        new Employee("Zakhar", lock);
        try {
            Thread.sleep(1600);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        new Employee("Alexander", lock);
        new Employee("Nikolay", lock);

    }
}

class Employee extends Thread {
    private Lock lock;
    private String name;

    Employee(String name, Lock lock) {
        this.lock = lock;
        this.name = name;
        this.start();
    }

    //    public void run() {
//        try {
//            System.out.println(name + " wait...");
//            lock.lock();
//            System.out.println(name + " is using ATM");
//            Thread.sleep(500);
//            System.out.println(name + " done his business");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            lock.unlock();
//        }
//    }
    public void run() {
        if (lock.tryLock()) {
            try {
                System.out.println(name + " is using ATM");
                Thread.sleep(500);
                System.out.println(name + " done his business");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " do not want to wait");
        }

    }

}