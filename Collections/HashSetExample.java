package Collections;

import java.util.*;
import java.util.stream.IntStream;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(7);
        hashSet1.add(3);
        hashSet1.add(10);
        hashSet1.add(2);
        System.out.println("hashSet1: " + hashSet1);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(5);
        hashSet2.add(7);
        hashSet2.add(3);
        hashSet2.add(8);
        hashSet2.add(6);
        System.out.println("hashSet2: " + hashSet2);

        HashSet<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
        System.out.println("union: " + union);

        HashSet<Integer> intersect = new HashSet<>(hashSet1);
        intersect.retainAll(hashSet2);
        System.out.println("intersect: " + intersect);

        HashSet<Integer> substruct = new HashSet<>(hashSet1);
        substruct.removeAll(hashSet2);
        System.out.println("substruct hashSet1 from hashSet2: " + substruct);

        Iterator<Integer> iterator = hashSet1.iterator();
        int[] arrayOfHashSet1 = new int[hashSet1.size()];
        for (int i = 0; i < arrayOfHashSet1.length; i++) {
            arrayOfHashSet1[i] = iterator.next();
        }
        System.out.println("arrayOfHashSet1: " + Arrays.toString(arrayOfHashSet1));
    }
}
