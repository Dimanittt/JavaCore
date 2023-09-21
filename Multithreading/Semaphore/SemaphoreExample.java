package Multithreading.Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2); // Semaphore is the high level synchronisator

        new Person("Dmitry", callBox);
        new Person("Olesya", callBox);
        new Person("Nikolay", callBox);
        new Person("Kseniya", callBox);
        new Person("Zakhar", callBox);



    }
}

class Person extends Thread {
    String name;
    Semaphore callBox;

    public Person(String name, Semaphore callBox){
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run(){
        System.out.println(name + " is waiting");
        try {
            callBox.acquire();
            System.out.println(name + " is using the phone");
            sleep(1000);
            System.out.println(name + " ened his call");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            callBox.release();
        }

    }

}