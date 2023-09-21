package Multithreading.Spleep_Join_Methods;

public class Example3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main begins");
        Thread worker = new Thread(new Worker());
        System.out.println("worker.getState() 1 - " + worker.getState());
        worker.start();
        System.out.println("worker.getState() 2 - " + worker.getState());
        worker.join(600); //.join(int millis) - limit thread in time
        System.out.println("worker.getState() 3 - " + worker.getState()); // states - new, ready, running, terminated
        System.out.println("Main ends");
    }
}

class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("Worker begins");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Worker ends");
    }

}