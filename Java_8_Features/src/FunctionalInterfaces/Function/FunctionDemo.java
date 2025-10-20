package FunctionalInterfaces.Function;

import java.util.function.Function;

public class FunctionDemo{

    public static void main(String[] args) {

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
