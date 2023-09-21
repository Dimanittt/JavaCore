package Collections;

import java.util.List;
import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Dmitry");
        list1.add("Olesya");
        list1.add("Alexander");
        System.out.println("list1: " + list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("!!!");
        list2.add("???");
        System.out.println("list2: " + list2);

        list1.addAll(list2);
        System.out.println("list1.addAll(list2): " + list1);

        list1.remove(3);
        list1.remove(3); // !!! Be careful for IndexOutOfBoundArray
        System.out.println("list1.remove(3) + list1.remove(3): " + list1);

        list1.addAll(0, list2);
        System.out.println("list1.addAll(0, list2): " + list1);
        list1.add("!!!");

        System.out.println("list1.add(!!!): " + list1);
        System.out.println("list1.indexOf(Dmitry) + list1.lastIndexOf(!!!) = " + list1.indexOf("Dmitry") + " + " + list1.lastIndexOf("!!!"));

        System.out.println("list1.size() + list1.isEmpty() = " + list1.size() + " + " + list1.isEmpty());

        list1.clear();
        System.out.println("list1.clear(): " + list1);
    }
}
