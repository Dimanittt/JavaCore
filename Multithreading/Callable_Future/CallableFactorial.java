package Multithreading.Callable_Future;

import javax.print.attribute.standard.RequestingUserName;
import java.util.concurrent.*;

public class CallableFactorial {

    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial1 factorial1 = new Factorial1(5);
        Future<Integer> future = executorService.submit(factorial1);
        try {
            System.out.println(future.isDone());
            System.out.println("Want to get result");
            factorialResult = future.get();
            System.out.println("Get result");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}

class Factorial1 implements Callable<Integer> {

    int f;

    public Factorial1(int f){
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0){
            throw new Exception("You entered incorrect number");
        } else {
            int result = 1;
            for (int i = 1; i <= f; i++) {
                result *= i;
                Thread.sleep(1000);
            }
            return result;
        }
    }
}
