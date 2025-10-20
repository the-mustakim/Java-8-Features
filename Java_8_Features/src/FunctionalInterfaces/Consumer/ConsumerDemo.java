package FunctionalInterfaces.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class ConsumerDemo{

    public static void main(String[] args) {

        //Example 1: accpet method of consumer interface
        Consumer<String> consumer1 = (t)-> System.out.println(t);
        consumer1.accept("This is lamda running inside the accept method of consumer interface");

        //Example 2: andThen method of Consumer interface
        Consumer<String> consumer2 = (input)-> System.out.println(input + " World");
        Consumer<String> consumer3 = (input)-> System.out.println(input + " Java");
        consumer2.andThen(consumer3).accept("Hello");

        //Example 3: forEach loop takes consumer interface
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        AtomicInteger count = new AtomicInteger(1);
        integerList.forEach((ele)->{System.out.println("Element" + count.get() + ":" + ele);
            count.getAndIncrement();
        });

    }

    //    @Override
    //    public Consumer andThen(Consumer after) {
    //        return Consumer.super.andThen(after);
    //    }

}
