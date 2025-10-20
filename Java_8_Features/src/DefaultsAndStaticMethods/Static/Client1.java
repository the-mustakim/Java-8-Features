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
