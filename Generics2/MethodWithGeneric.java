package Generics2;

import java.util.*;

public class MethodWithGeneric {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    int i1 = genMethod(list);
        System.out.println(i1);
    }


    public static <T> T genMethod(ArrayList<T> al){
        return al.get(1);
    }
}


