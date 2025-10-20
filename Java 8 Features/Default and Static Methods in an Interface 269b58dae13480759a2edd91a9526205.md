# Default and Static Methods in an Interface

https://www.youtube.com/watch?v=b4paTLGsJjE&list=PLA3GkZPtsafZR6arC1A3N0i968gk9RvMv&index=6

https://www.youtube.com/watch?v=nGGEh0aHLwQ&list=PLA3GkZPtsafZR6arC1A3N0i968gk9RvMv&index=7

## Default Methods:

![image.png](Default%20and%20Static%20Methods%20in%20an%20Interface/image.png)

```
package DefaultsAndStaticMethods.Default;

interface Parent{
    default void sayHello(){
        System.out.println("Hello");
    }
}

class Child implements Parent{
    @Override
    public void sayHello() {
        System.out.println("This is override");
    }
}

public class Client{
    public static void main(String[] args) {

//        Parent p1 = new Parent();
//        p1.sayHello();

        Parent p2 = new Child();
        p2.sayHello();

    }
}

```

```
package DefaultsAndStaticMethods.Default;

interface A{
    default void sayHello(){
        System.out.println("A says Hello");
    }
}

interface B{
    default void sayHello(){
        System.out.println("B says Hello");
    }
}

public class Client2 implements A,B{

    public static void main(String[] args) {
        Client2 client2 = new Client2();
        client2.sayHello();
    }

    @Override
    public void sayHello() {
        B.super.sayHello();
    }
}

```

## Static Methods:

![WhatsApp Image 2025-09-12 at 23.31.21_441ea6a4.jpg](Default%20and%20Static%20Methods%20in%20an%20Interface/WhatsApp_Image_2025-09-12_at_23.31.21_441ea6a4.jpg)

```
package DefaultsAndStaticMethods.Static;

interface A{
    static void sayHello(){
        System.out.println(" Hi from the static method of interface A");
    }
}

public class Client1 implements A{
    // This is separate method we can not override the static method of the interface
    // public static void sayHello(){
    // System.out.println(" Hi from the static method of interface A");
    //}

    public static void main(String[] args) {
        Client1 client1 = new Client1();
        //client1.sayHello(); //Cant call static sayHello from here it wont be visible

        A.sayHello();

    }

}

```