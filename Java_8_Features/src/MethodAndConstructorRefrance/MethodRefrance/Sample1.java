package MethodAndConstructorRefrance.MethodRefrance;

import java.util.Arrays;
import java.util.List;

public class Sample1 {

    public static  void Staticprint(String s){
        System.out.println(" This is printed using method reference operator and it belongs to static method: " + s);

    }

    public void NotStaticPrint(String s){
        System.out.println(" This is printed using method reference operator and it belongs non-static method: " + s);

    }

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Alice", "Bob", "Charlie");

        // We can iterate list using forEach right?
        nameList.forEach(x -> System.out.println("This is printed using lambda expression: " + x));

        // Now, can we replace the lambda expression???? YESSS, How? By passing method reference as argument
        nameList.forEach(Sample1::Staticprint);

        // We can use object as well to call that method
        Sample1 sample1 = new Sample1();
        nameList.forEach(sample1::NotStaticPrint);

    }

}
