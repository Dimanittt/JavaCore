package StreamAPI;

import java.util.Arrays;

public class ForEachFunction {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println();

        System.out.println("Initial array: " + Arrays.toString(array));
        System.out.print("array which elements *2: ");
        Arrays.stream(array).forEach(x -> {
            x *= 2;
            System.out.print(x + " ");
        });
        System.out.println();

        System.out.print("Utils::myMethod - ");
        Arrays.stream(array).forEach(Utils::myMethod);
        System.out.println();
        System.out.print("Utils.myMethod(x) - ");
        Arrays.stream(array).forEach(x -> Utils.myMethod(x));

    }
}

class Utils {
    public static void myMethod(int a){
        a += 5;
        System.out.print(a + " ");
    }
}