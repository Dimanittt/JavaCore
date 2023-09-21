package Collections;
import java.util.List;
import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        System.out.println("There are two constructors for ArraList - initial capacity and another ArrayList");
        List<Integer> list1 = new ArrayList<>(10);
        for (int i = 1; i < 6; i++) {
            list1.add(i);
        }
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>(list1);
        list2.add(6);
        System.out.println(list2);
    }
}
