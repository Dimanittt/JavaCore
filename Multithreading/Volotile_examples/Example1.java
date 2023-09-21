package Multithreading.Volotile_examples;

public class Example1 extends Thread{

    volatile boolean b = true; //volatile is usable when we read B by 1000threads but change B only by 1 thread


    public void run(){
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Thread finished with counter = " + counter);
    }


    public static void main(String[] args) throws InterruptedException {
        Example1 thread = new Example1();
        thread.start();
        Thread.sleep(3000);
        System.out.println("thread.sleep() for 3 sec");
        thread.b = false;
        thread.join();
        System.out.println("End of programm!");
    }
}
