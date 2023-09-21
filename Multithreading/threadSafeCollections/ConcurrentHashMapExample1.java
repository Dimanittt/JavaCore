package Multithreading.threadSafeCollections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts\n");
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Dmitry");
        map.put(2, "Olesya");
        map.put(3, "Nikolay");
        map.put(4, "Zakhar");
        map.put(5, "Ksenia");
        System.out.println(map +"\n");

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int i = iterator.next();
                System.out.println(i + " : " + map.get(i));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(6, "Oleg");
        };

        Thread thread1 = new Thread(runnable1);
        thread1.setName("mapIterator");
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


        System.out.println("\n" + map + "\n\nMain ends");
    }
}
