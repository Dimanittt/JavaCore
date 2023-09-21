package Generics2;

import java.util.ArrayList;
import java.util.List;

public class GenericsStart {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("Hello");
        list.add("Car");
        list.add("Ferrari");

        for (Object o : list){
            System.out.println(o + " - " + ((String) o).length());
        }
    }
}
