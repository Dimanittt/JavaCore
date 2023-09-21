package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Dmitry");
        list1.add("Olesya");
        list1.add("Alexander");
        list1.add("Ksenia");
        list1.add("Andrey");
        System.out.println("list1: " + list1);

        Iterator<String> iterator = list1.iterator();

        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println("list1 after using iterator of removing : " + list1);
    }
}
