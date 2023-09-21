package Multithreading.Synchronized_ReentrantLock_Methods;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample1 {
    Lock lock = new ReentrantLock();


    public static void main(String[] args) {

        ReentrantLockExample1 reentrantLockExample1 = new ReentrantLockExample1();

        Runnable mobile = () -> {
            reentrantLockExample1.mobileCall();
        };

        Runnable watsApp = () -> {
            reentrantLockExample1.watsAppCall();
        };

        Runnable skype = () -> {
            reentrantLockExample1.skypeCall();
        };

        Thread thread1 = new Thread(mobile);
        Thread thread2 = new Thread(watsApp);
        Thread thread3 = new Thread(skype);

        thread1.start();
        thread2.start();
        thread3.start();
    }



    public void mobileCall(){
        lock.lock();
        try {
            System.out.println("Mobile call begins");
            Thread.sleep(1000);
            System.out.println("Mobile call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void watsAppCall() {
        lock.lock();
        try {
            System.out.println("WatsApp call begins");
            Thread.sleep(2000);
            System.out.println("WatsApp call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void skypeCall() {
        lock.lock();
        try {
            System.out.println("Skype call begins");
            Thread.sleep(3000);
            System.out.println("Skype call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
