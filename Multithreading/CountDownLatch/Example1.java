package Multithreading.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Example1 {
    static CountDownLatch countDownLatch = new CountDownLatch(3); //CountDownLatch is the high level synchronisator

    private static void staffPreparingTheMarket() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Staff prepared the marketplace");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void preparingMarketToOpenTheDoors() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Doors are ready to be opened");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void openTheDoor() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Doors are opened");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Dmitry", countDownLatch);
        new Friend("Olesya", countDownLatch);
        new Friend("Nikolay", countDownLatch);
        new Friend("Zakhar", countDownLatch);
        new Friend("Kseniya", countDownLatch);

        staffPreparingTheMarket();
        preparingMarketToOpenTheDoors();
        openTheDoor();

    }


}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch){
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run(){
        try {
            countDownLatch.await();
            System.out.println(name + " commences his shopping");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}