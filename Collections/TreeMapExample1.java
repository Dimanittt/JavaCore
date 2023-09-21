package Collections;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample1 {
    public static void main(String[] args) {
        TreeMap<Double, Pupil> treeMap = new TreeMap<>(); // new Comparator... for classes
        Pupil pupil1 = new Pupil("Dmitry", "Starostin", 3);
        Pupil pupil2 = new Pupil("Olesya", "Afanasyeva", 1);
        Pupil pupil3 = new Pupil("Alexander", "Butorin", 3);
        Pupil pupil4 = new Pupil("Kolya", "Mironov", 2);
        Pupil pupil5 = new Pupil("Zakhar", "Litvinenko", 4);
        Pupil pupil6 = new Pupil("Kseniya", "Bedenko", 1);
        Pupil pupil7 = new Pupil("Yulia", "Starostina", 4);
        treeMap.put(9.2, pupil1);
        treeMap.put(7.9, pupil2);
        treeMap.put(5.6, pupil3);
        treeMap.put(3.6, pupil4);
        treeMap.put(9.0, pupil5);
        treeMap.put(8.2, pupil6);
        treeMap.put(9.3, pupil7);
        System.out.println("TREEMAP: " + treeMap);
        System.out.println("TREEMAP.DESCENDINGMAP(): " + treeMap.descendingMap());
        System.out.println("TREEMAP.TIALMAP(6.0): " + treeMap.tailMap(6.0));
        System.out.println("TREEMAP.HEADMAP(6.0): " + treeMap.headMap(6.0));
        System.out.println("TREEMAP.FIRSTENTRY(): " + treeMap.firstEntry());
        System.out.println("TREEMAP.LASTENTRY(): " + treeMap.lastEntry());
        Pupil pupil8 = new Pupil("Yulia", "Starostina", 4);
//        System.out.println("treeMap.containsKey(pupil8): " + treeMap.containsKey(pupil8)); if we compares classes, we do not use equals and hashcode in treemap

    }
}
