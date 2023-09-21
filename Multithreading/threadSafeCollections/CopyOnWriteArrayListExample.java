package Multithreading.threadSafeCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts\n");

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        list.add("Dmitry");
        list.add("Olesya");
        list.add("Alexander");
        list.add("Nikolay");
        list.add("Ksenia");
        System.out.println(list + "\n");

        Runnable runnable1 = () -> {
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(iterator.next());
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list.remove(3);
            list.add("Zakhar");
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("\n" + list + "\nMain ends");
    }
}
