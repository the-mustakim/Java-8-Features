# Functional Interfaces

https://www.youtube.com/watch?v=twGS0G3y6PY&t=1592s

## Consumer

```java
package FunctionalInterfaces.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class ConsumerDemo{

    public static void main(String[] args) {
				
				/*** **accpet()** method of consumer interface takes one argument and  returns nothing ***/
				
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

```

## Function

```java
package FunctionalInterfaces.Function;

import java.util.function.Function;

public class FunctionDemo{

    public static void main(String[] args) {
			
				/*** **apply(input)** method of Function takes one argument and returns something ***/
				
				
        //Example 1: Sent Integer and returned String
        Function<Integer,String> function1 = (input)->"The integer sent by the function is: " + Integer.toString(input);
        System.out.println(function1.apply(10));

        //Example 2: Check weather the integer is even or odd
        Function<Integer,Boolean> function2 =(input)->input%2==0?true:false;
        System.out.println(function2.apply(11));

        //Example 3: andThen method of Function interface
        Function<String, Integer> function3 = (input) -> input.length();
        Function<Integer,Integer> function4 = (input) -> input*2;
        Integer finalValue = function3.andThen(function4).apply("Mustakim");
        System.out.println("The lenght of the 'Mustakim' * 2 is: " + finalValue);

    }
}

```

## Predicate

```java
package FunctionalInterfaces.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class PredicateDemo{

    // If someone asks you what predicate is, then you have to tell Predicate is a boolean valued function
    public static void main(String[] args) {
		    
		    /*** test(input) method of predicate takes one argument and returns a boolean***/
		    
        //Example 1: Check the salary
        Predicate<Integer> predicate1 = (Integer value)->value>10000;
        System.out.println("Is salary greater than 10000: " + predicate1.test(100000));

        //Example 2: Filter the list for even numbers
        Predicate<Integer> predicate2 = (ele)-> ele%2==0? true:false;
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for(int n: list){
            if(predicate2.test(n)){
                System.out.println(n);
            }
        }

        // Default and Static methods in predicate
        Predicate<String> startsWithLetterV = x -> x.toLowerCase().charAt(0)=='v';
        Predicate<String> endsWithLetterL = x -> x.toLowerCase().charAt(x.length()-1)=='l';

        Predicate<String> and = startsWithLetterV.and(endsWithLetterL); //Both Predicate conditions should be stasfied
        System.out.println(and.test("Vipul"));

        Predicate<String> or = startsWithLetterV.or(endsWithLetterL); //Atleast one of the predicate should be satisfied
        System.out.println(or.test("Ramesh"));

        Predicate<String> negate = startsWithLetterV.negate();
        System.out.println(negate.test("Vipul"));

        // isEqual compares two things and returns booleans
        Predicate<Object> predicate3 = Predicate.isEqual("Vipul");
        System.out.println(predicate3.test("Vipul"));

    }

    public static class Student{
        String name;
        int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }
    }
}

```

## Supplier

```java
package FunctionalInterfaces.Supplier;

import java.util.function.Supplier;

public class SupplierDemo{
	
		/*** get() method os the Supplier takes nothing and return something ***/

    public static void main(String[] args) {
        Supplier<String> supplier1 = ()->"This string is been returned from get method of Supplier";
        System.out.println(supplier1.get());
    }

}

```