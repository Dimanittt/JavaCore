package LambdaExpressions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class BadConsumerExample {


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);

        Consumer<Integer> consumer = x -> {
            for (int i = 0; i < arrayList.size()/2; i++) {
                int temp = arrayList.get(i);
                arrayList.set(i, arrayList.get((arrayList.size())-i-1));
                arrayList.set((arrayList.size()-i-1), temp);
            }
        };

        consumer.accept(0);
        System.out.println(arrayList);

    }
}
