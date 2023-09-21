package Multithreading.CreateThread;

public class CreateThreadViaAnonClass {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 101; i++) {
                    System.out.println(i);
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 100; i > -1; i--) {
                System.out.println(i);
            }
        }).start();;

    }
}
