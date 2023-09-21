package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Dmitry");
        list1.add("Olesya");
        list1.add("Alexander");
        System.out.println("list1: " + list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Olesya");
        list2.add("Zakhar");
        list2.add("Alexander");
        System.out.println("list2: " + list2);

        list1.removeAll(list2);
        System.out.println("list1.removeAll(list2): " + list1);

        list1.add("Olesya");
        list1.add("Alexander");
        System.out.println("list1.add(Olesya) + list1.add(Alexander): " + list1);
        list1.retainAll(list2);
        System.out.println("list1.retainAll(list2): " + list1);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Alexander");
        list3.add("Olesya");
        System.out.println("list3: " + list3);
        System.out.println("list1.containsAll(list3): " + list1.containsAll(list3));

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Dmitry");
        list4.add("Olesya");
        list4.add("Alexander");
        list4.add("Varya");
        list4.add("Kolya");
        System.out.println("list4: " + list4);
        List<String> newList = list4.subList(1, 4);
        System.out.println("newList = list4.subList(1, 4): " + newList); //newList is a view of list4. Method uses the same mechanism as in ArrayListMethods3
        newList.add("Ksenia");
        System.out.println("newList.add(Ksenia): " + newList);
        System.out.println("list4: " + list4);
//        list4.add("Error");
//        System.out.println("newList : " + newList); YOU CANT USE newList AFTER MODIFYING list4
//        System.out.println("list4 : " + list4);

        Object[] array = list4.toArray();
        System.out.print("Object[] array = list4.toArray(): ");
        for (Object o : array){
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.print("String[] stringArray = list4.toArray(new String[list4.size() + 2]): ");
        String[] stringArray = list4.toArray(new String[list4.size() + 2]); //use new String[0]
        for (String s : stringArray){
            System.out.print(s + " ");
        }
        System.out.println();

        List<Integer> list = List.of(1,2,3,4,5); //this list is immutable and cannot contain null!!!
        System.out.println("List<Integer> list = List.of(1,2,3,4,5): " + list + " - immutable");
        List<String> stringList = List.copyOf(list4); //this list is immutable and cannot contain null!!!
        System.out.println("List<String> stringList = List.copyOf(list4): " + stringList + " - immutable");
    }
}
