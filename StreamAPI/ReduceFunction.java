package StreamAPI;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceFunction {

    public static void main(String[] args) {
        System.out.println();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        int result = arrayList.stream().reduce((accumulator, x) -> accumulator * x).get();
        System.out.println("int result = arrayList.stream().reduce((accumulator, x) -> accumulator*x).get() = " + result);
        System.out.println();

        ArrayList<Integer> arrayList1 = new ArrayList<>();

        Optional<Integer> optional = arrayList1.stream().reduce((accumulator, x) -> accumulator * x);
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("Not present");
        }
        System.out.println();

        int result1 = arrayList.stream().reduce(2, (accumulator, x) -> accumulator * x);
        System.out.println("int result1 = arrayList.stream().reduce(2, (accumulator, x) -> accumulator*x).get() = " + result1);
        System.out.println();

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("I");
        arrayList2.add("would");
        arrayList2.add("like");
        arrayList2.add("to");
        arrayList2.add("become");
        arrayList2.add("master");
        arrayList2.add("in");
        arrayList2.add("Stream");
        arrayList2.add("API");
        String string = arrayList2.stream().reduce("Wow,", (accum, x) -> accum + " " + x);
        System.out.println("String string = arrayList2.stream().reduce(\"Wow,\", (accum, x) -> accum + \" \" + x): " + string);
    }
}
