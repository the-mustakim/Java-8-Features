package FunctionalInterfaces.CustomFunctionalInterface;

public class Client {
    public static void main(String[] args) {

        MyFunctional<Integer> myFunctional =(input)->input>500;
        System.out.println("The given input is grater than 500: " + myFunctional.mustakim(550));
    }
}
