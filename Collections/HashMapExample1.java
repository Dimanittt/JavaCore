package Collections;

import java.util.*;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Dmitry");
        map1.put(2000, "Olesya");
        map1.put(3000, "Alexander");
        map1.put(4000, "Zakhar");
        map1.put(5000, "Varya");
        map1.put(null, "Kolya");
        map1.put(6000, null);
        map1.putIfAbsent(1000, "Oleg");
        System.out.println("map1: " + map1);
        System.out.println("map1.containsValue(\"Dmitry\"): " + map1.containsValue("Dmitry"));
        System.out.println("map1.keySet():" + map1.keySet());
        Set<Integer> list = map1.keySet();
        System.out.println("Set<Integer> list = map1.keySet(): " + list);
        Collection<String> collection = map1.values();
        //        for (String s : collection){
//            collectionArrayList.add(s);
//        }
        ArrayList<String> collectionArrayList = new ArrayList<>(collection);
        System.out.println(collectionArrayList);
    }
}
