package Multithreading.threadSafeCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 15; i++) {
            list.add(i);
        }

        List<Integer> synchList = Collections.synchronizedList(list);


        Runnable runnable1 = () -> {
            synchronized (synchList){
                Iterator<Integer> iterator = synchList.iterator();
                while (iterator.hasNext()){
                    System.out.println(iterator.next());
                }
            }
        };

        Runnable runnable2 = () -> {
            synchList.remove(10);
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(synchList);
    }
}
