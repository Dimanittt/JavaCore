package Multithreading.DaemonThreads;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread main begins");
        Thread userThread = new Thread(new UserThread());
        Thread daemonThread = new Thread(new DaemonThread());
        userThread.setName("user_thread");
        daemonThread.setName("daemon_thread");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
        userThread.join();
        System.out.println("Thread main ends");
    }
}

class UserThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + Thread.currentThread().isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                Thread.sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DaemonThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + Thread.currentThread().isDaemon());
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}