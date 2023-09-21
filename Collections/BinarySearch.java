package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-4);
        arrayList.add(0);
        arrayList.add(6);
        arrayList.add(11);
        arrayList.add(-91);
        arrayList.add(-2);
        arrayList.add(54);
        arrayList.add(0);
        arrayList.add(-41);
        arrayList.add(-60);
        System.out.println("arrayList: " + arrayList);
        int index = Collections.binarySearch(arrayList, -91);
        System.out.println("Collections.binarySearch(arrayList, -91): " + index);
        Collections.sort(arrayList);
        index = Collections.binarySearch(arrayList, -91);
        System.out.println("sorted arrayList: " + arrayList);
        System.out.println("Collections.binarySearch(arrayList, -91): " + index);
        Collections.reverse(arrayList);
        System.out.println("Collections.reverse(arrayList): " + arrayList);
        Collections.shuffle(arrayList);
        System.out.println("Collections.shuffle(arrayList): " + arrayList);
    }
}
