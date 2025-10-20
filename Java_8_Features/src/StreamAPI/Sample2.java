package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sample2 {
    public static void main(String[] args) {

        //Change the list to stream
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> myStream = list.stream();

        //Change the array to stream
        String array[] = {"apple", "banana", "cherry"};
        Stream<String> stream = Arrays.stream(array);

        //Creating the stream of random numbers
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);

        // Create the stream using iterate takes seed the starting point as 0 and the logic to increment
        // the number using unary operator(function) limit is 100 so it will create the stream till 100
        Stream<Integer> limit = Stream.iterate(0,n->n+1).limit(100);

        // Using generate, takes the supplier
        Stream<Double> limit1 = Stream.generate(()-> (double) Math.random() * 100).limit(100);

    }
}
