package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedFunction {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            arrayList.add(i);
        }
        Collections.shuffle(arrayList);
        System.out.println("Initial arrayList: " + arrayList);
        System.out.println();

        arrayList = arrayList.stream().sorted().collect(Collectors.toList());
        System.out.println("arrayList.stream().sorted().collect(Collectors.toList()): " + arrayList);
        System.out.println();

        int result = arrayList.stream().filter(x -> (x%2==1)).map(x -> {
            if (x%3==0) x /=3;
            return x;
        }).reduce((sum, x) -> sum+x).get();
        System.out.println("result = " + result);
    }
}
 // 1,3,5,7,9,11,13,15,17,19
//1,1,5,7,3,11,13,5,17,19 == 46 + 36