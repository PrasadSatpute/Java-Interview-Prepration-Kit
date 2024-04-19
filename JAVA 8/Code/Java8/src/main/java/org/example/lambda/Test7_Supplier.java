package org.example.lambda;
import java.util.function.Supplier;
public class Test7_Supplier {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());
    }
}
