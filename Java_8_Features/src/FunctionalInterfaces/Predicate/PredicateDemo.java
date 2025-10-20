package FunctionalInterfaces.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo{

    // If someone ask you what is predicate then you have to tell Predicate is a boolean valued function

    public static void main(String[] args) {
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
