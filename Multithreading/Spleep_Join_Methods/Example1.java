package Multithreading.Spleep_Join_Methods;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(250);
        }
        System.out.println("RUN!!!");
    }
}
