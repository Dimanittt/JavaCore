package Collections;

import java.util.LinkedHashMap;

public class LinkedHashMapExample1 {
    public static void main(String[] args) {
        LinkedHashMap<Double, Pupil> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        Pupil pupil1 = new Pupil("Dmitry", "Starostin", 3);
        Pupil pupil2 = new Pupil("Olesya", "Afanasyeva", 1);
        Pupil pupil3 = new Pupil("Alexander", "Butorin", 3);
        Pupil pupil4 = new Pupil("Kolya", "Mironov", 2);

        linkedHashMap.put(9.2, pupil1);
        linkedHashMap.put(7.9, pupil2);
        linkedHashMap.put(5.6, pupil3);
        linkedHashMap.put(3.6, pupil4);

        System.out.println("linkedHashMap: ".toUpperCase() + linkedHashMap);
        System.out.println("linkedHashMap.get(9.2): ".toUpperCase() + linkedHashMap.get(9.2));
        System.out.println("linkedHashMap: ".toUpperCase() + linkedHashMap);
    }
}
