package Multithreading.CreateThread;

public class CreateThreadViaClassExtend {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start(); //threads run randomly in this case
        myThread2.start();
    }
}

class MyThread1 extends Thread {
    public void run(){
        for (int i = 0; i < 101; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread {
    public void run(){
        for (int i = 100; i > -1; i--) {
            System.out.println(i);
        }
    }
}