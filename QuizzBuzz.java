import java.util.Arrays;
import java.util.stream.IntStream;

public class QuizzBuzz {
    public static void main(String[] args) {

        IntStream.rangeClosed(1, 100).mapToObj(x -> {
            StringBuilder string = new StringBuilder("Quizz");
            if (x%3==0){
                if (x%5==0) return string.append("Buzz");
                else return string;
            } else if (x%5==0) return "Buzz";
            else return x;
        }).forEach(x -> System.out.print(x + " "));
        System.out.println();

        int sum = IntStream.rangeClosed(1, 100).filter(x ->
                x%3 != 0 && x%5 != 0).reduce((summ, x) -> summ+x).getAsInt();
        System.out.println("sum of numbers from 1 to 100: " + sum);
        System.out.println();

        int a = 5;
        int b = 5;
        int[] array = new int[b];
        Arrays.fill(array, a);
        int perfectPower = IntStream.of(array).reduce((x,y) -> x*y).getAsInt();
        System.out.println("perfect power of " + a + " in " + b + ": " + perfectPower);
    }
}
