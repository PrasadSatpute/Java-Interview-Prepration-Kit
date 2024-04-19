package org.example.practice;

//Implement a custom functional interface and use it with a lambda expression.
public class Test6_FunctionalInterface {
    @FunctionalInterface
    interface CustomInterface
    {
        void function(String s);
    }
    public static void main(String[] args) {
        CustomInterface customInterface = System.out::println;
        customInterface.function("Hi Custom Interface");
    }
}
