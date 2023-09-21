package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class MapFunction {
    public static void main(String[] args) {
        System.out.println();
        List<String> list = new ArrayList<>();
        list.add("Dmitry");
        list.add("Olesya");
        list.add("Nikolay");
        list.add("Kseniya");
        list.add("Zakhar");
        System.out.println("Initial list: " + list);
        List<String> transitList = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            int length = list.get(i).length();
            list.set(i, String.valueOf(length));
        }
        System.out.println("Modified list: " + list);
        List<Integer> list1 = transitList.stream().map(x -> x.length()).collect(Collectors.toList());
        System.out.println("Modified list got by stream(): " + list1);
//        System.out.println("transitList: " + transitList);
        System.out.println();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Initial array: " + Arrays.toString(array));
        array = Arrays.stream(array)
                .map(x -> {
                    if (x % 3 == 0) x /= 3;
                    return x;
                })
                .toArray();
        System.out.println("Modified array with stream(): " + Arrays.toString(array));
        System.out.println();

        Set<String> set = new TreeSet<>(transitList);

        set.add("Varya");
        set.add("Danil");
        set.add("Oleg");

        System.out.println("Initial set: " + set);
        Set<Integer> set1 = set.stream().map(x -> x.length()).collect(Collectors.toSet());
        System.out.println("Modified set with stram(): " + set1);


    }
}
