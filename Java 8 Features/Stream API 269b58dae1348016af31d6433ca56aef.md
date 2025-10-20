# Stream API

https://www.youtube.com/watch?v=DYyhFLC2eJ0&list=PLA3GkZPtsafZR6arC1A3N0i968gk9RvMv&index=22

![image.png](Stream%20API/image.png)

```java
package StreamAPI;

import java.util.Arrays;

public class Sample1 {

    public static void main(String[] args) {

        // This is an imperative approach of coding
        int [] array = {1,2,3,4,5};
        int sum = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                sum += array[i];
            }
        }
        System.out.println("The sum of array 1 even is: " + sum);

        // Java Stream
        int[] array2 = {1,2,3,4,5};
        int sum2 = Arrays.stream(array).filter(n->n%2==0? true:false).sum(); ;

        System.out.println("The sum of array 2 even numbers using stream is: " + sum);

    }
}

```

```java
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

```

```java
package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,5,11,22,33,44);
        System.out.println("List before any operation: " + list);
        //List before any operation: [1, 2, 3, 4, 5, 5, 11, 22, 33, 44]

        // How to use the filter in the stream
        List<Integer> filteredList = list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println("List after the filter is: " + filteredList);
        //List after the filter is: [2, 4, 22, 44]

        // How to use the map in the steam
        List<Integer> mapList = list.stream().map(n->n/2).collect(Collectors.toList());
        System.out.println("List after performing map operation: " + mapList);
        //List after performing map operation: [0, 1, 1, 2, 2, 2, 5, 11, 16, 22]

        // How to remove duplicates from the stream
        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("List after removing the duplicates:" + distinctList);
        //List after removing the duplicates:[1, 2, 3, 4, 5, 11, 22, 33, 44]

        // How to sort from using stream
        // sorted takes the comparator to sort the elements
        // o2 - o1 to sort in descending
        List<Integer> sortedList = list.stream().sorted((o1,o2)->o2-o1).collect(Collectors.toList());
        System.out.println("List after sorting the elements:" + sortedList);
        //List after sorting the elements:[44, 33, 22, 11, 5, 5, 4, 3, 2, 1]

        // limit - starting ke kitne element chayiye apko
        List<Integer> limitList = list.stream().limit(2).collect(Collectors.toList());
        System.out.println("List after using limit - starting ke kitne element chaiye:" + limitList);
        //List after using limit - starting ke kitne element chaiye:[1, 2]

        // skip - startign ke kitne element ap skip karna chate hai
        List<Integer> skipList = list.stream().skip(2).collect(Collectors.toList());
        System.out.println("List after using limit - starting ke kitne element ap skip karna chate hai:" + skipList);
        //List after using limit - starting ke kitne element ap skip karna chate hai:[3, 4, 5, 5, 11, 22, 33, 44]

        // peek - takes the consumer interface - jo chaho kar sakte ho stream ke sath
        List<Integer> peekIterateList = Stream.iterate(0,n->n+1).limit(4).peek((x)-> System.out.println("Element: " + x)).collect(Collectors.toList());
        /**
         * Element: 0
         * Element: 1
         * Element: 2
         * Element: 3
         * Element: 4
         * ***/

        // Find the max from the stream
        //Default o1 - o2 : last wala element sort karke
        //o2 - o1 : descending sort karke last wala element return karega
        Integer maxValue = list.stream().max((o1, o2) -> o1 - o2).get();
        System.out.println("Max is: " + maxValue);
        //Max is: 44

        // Find the min from the stream
        //Default o2 - o1 : last wala element descending sort karke
        //o1 - o2 : sort karke last wala element return karega
        Integer minValue = list.stream().min((o2, o1) -> o2-o1).get();
        System.out.println("Min is: " + minValue);
        //Min is: 1

        // Count the elements
        long cnt = list.stream().count();
        System.out.println("The no of elements in the list are: "+cnt);
        //The no of elements in the list are: 10

    }
}

```