# Method& Constructor references

https://www.youtube.com/watch?v=ar5jQQRWxFM&list=PLA3GkZPtsafZR6arC1A3N0i968gk9RvMv&index=18

![image.png](Method&%20Constructor%20references/image.png)

## Method References

```java
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

```

## Constructor References

```java

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

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

```