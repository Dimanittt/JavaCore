package Collections;
import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Dmitry");
        list1.add("Olesya");
        list1.add("Alexander");
        System.out.print("list1: " + list1);
        System.out.println();
        list1.add(0, "Mikhail");
        System.out.print ("list1.add(0, Mikhail): " + list1);
        System.out.println();
        list1.set(0, "Codewars.Max");
        System.out.print ("list1.set(0, Codewars.Max): " + list1);
        System.out.println();
        list1.remove(0);
        list1.remove("Alexander");
        System.out.print ("list1.remove(0) + list1.remove(Alexander): " + list1);
    }
}
