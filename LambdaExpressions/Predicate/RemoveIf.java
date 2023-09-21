package LambdaExpressions.Predicate;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(1);
        arrayList.add(10);
        System.out.println("arrayList: " + arrayList);
        arrayList.sort((x, y) -> x-y);
        System.out.println("arrayList.sort((x, y) -> x-y): " + arrayList);
        arrayList.removeIf(x -> x < 5);
        System.out.println("arrayList.removeIf(x -> x < 5): " + arrayList);
    }
}
