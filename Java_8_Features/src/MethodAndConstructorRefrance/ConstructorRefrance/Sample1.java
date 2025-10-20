package MethodAndConstructorRefrance.ConstructorRefrance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample1 {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Alice", "Bob", "Charlie");

        // As we know earlier that Lambda expressions can be replaced by method and constructor refrances
        // As you can see below, we are passing a lamba expression (Function Functional Interface) which is returning me a new student for each name
        List<Student> studentList1 = nameList.stream().map(x -> new Student(x)).collect(Collectors.toList());

        // What I can do is I can pass the constructore refrance instead of the lambda expression
        List<Student> studentList2 = nameList.stream().map(Student::new).collect(Collectors.toList());


    }
}
