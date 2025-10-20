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
