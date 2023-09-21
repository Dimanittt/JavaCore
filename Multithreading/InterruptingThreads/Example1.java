package Multithreading.InterruptingThreads;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main begins");
        Thread thread1 = new InterruptedThread();
        thread1.start();
        Thread.sleep(2000);
        thread1.interrupt();
        thread1.join();
        System.out.println("Main ends");
    }
}

class InterruptedThread extends Thread {


    public void run() {
        double res = 0;
            for (int i = 0; i < 1000000000; i++) {
                if (isInterrupted()){
                    System.out.println("The thread is interrupted, res = " + res);
                }
                res += Math.sqrt((double) i);
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("The thread was interrupted while it's sleeping, res = " + res);
                    return;
                }
            }
        System.out.println(res);
    }
}