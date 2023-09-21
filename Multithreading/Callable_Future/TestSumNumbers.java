package Multithreading.Callable_Future;

public class TestSumNumbers {
    static long sum;

    public static void main(String[] args) {
        for (long i = 0; i <= 1000000000; i++) {
            sum += i;
        }
        System.out.println("Our sum = " + sum);
    }
}
