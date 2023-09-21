package Multithreading.Name_Priority;

public class Example1 {
    public static void main(String[] args) {
        Thread myThread1 = new Thread(new MyThread1());
        System.out.println("{ myThread1 name : myThread1 priopiry } - { " + myThread1.getName() + " : " + myThread1.getPriority() + " }");
        Thread myThread2 = new Thread(new MyThread1());
        System.out.println("{ myThread2 name : myThread2 priopiry } - { " + myThread2.getName() + " : " + myThread2.getPriority() + " }");

        myThread1.setName("Chat");
        myThread1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("{ myThread1 name : myThread1 priopiry } - { " + myThread1.getName() + " : " + myThread1.getPriority() + " }");
    }
}

class MyThread1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello");
    }
}
