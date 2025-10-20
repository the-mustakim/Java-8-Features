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
