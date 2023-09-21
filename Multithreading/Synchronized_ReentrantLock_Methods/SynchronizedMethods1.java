package Multithreading.Synchronized_ReentrantLock_Methods;

public class SynchronizedMethods1 {
    static final Object lock = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MobileCallImpl());
        Thread thread2 = new Thread(new SkypeCallImpl());
        Thread thread3 = new Thread(new WhatsAppCallImpl());
        thread1.start();
        thread2.start();
        thread3.start();
    }

    public void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }

    public void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }


    public void whatsAppCall() {
        synchronized (lock) {
            System.out.println("WhatsApp call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WhatsApp call ends");
        }
    }
}

class MobileCallImpl implements Runnable {
    @Override
    public void run() {
        new SynchronizedMethods1().mobileCall();
    }
}

class SkypeCallImpl implements Runnable {
    @Override
    public void run() {
        new SynchronizedMethods1().skypeCall();
    }
}

class WhatsAppCallImpl implements Runnable {
    @Override
    public void run() {
        new SynchronizedMethods1().whatsAppCall();
    }
}

