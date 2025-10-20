package FunctionalInterfaces.Supplier;

import java.util.function.Supplier;

public class SupplierDemo{

    public static void main(String[] args) {
        Supplier<String> supplier1 = ()->"This string is been returned from get method of Supplier";
        System.out.println(supplier1.get());
    }

}
