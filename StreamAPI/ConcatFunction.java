package StreamAPI;

import java.util.stream.Stream;

public class ConcatFunction {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3);
        Stream<Integer> stream2 = Stream.of(4,5,6);
        Stream<Integer> stream3 = Stream.concat(stream1, stream2);
        System.out.print("Stream<Integer> stream3 = Stream.concat(stream1, stream2): ");
        stream3.forEach(System.out::print);
        System.out.println();
        System.out.println();

        Stream<Integer> stream4 = Stream.of(1,1,2,2,3,3,4,4,5,5).distinct(); //use equals()
        System.out.print("Stream.of(1,1,2,2,3,3,4,4,5,5).distinct(): ");
        stream4.forEach(System.out::print);
        System.out.println();
        System.out.println();

        Stream<Integer> stream5 = Stream.of(1,1,2,2,3,3,4,4,5,5);
        System.out.println("stream5.count(): " + stream5.count());
        System.out.println();
        System.out.println();

        Stream<Integer> stream6 = Stream.of(1,1,2,2,3,3,4,4,5,5);
        System.out.println(stream6.peek(System.out::print).distinct().count()); //peek let you see the whole stream
    }


}
