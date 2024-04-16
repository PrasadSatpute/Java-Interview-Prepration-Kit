package org.example.lambda;

@FunctionalInterface
interface MyInterface
{
    public void sayHi();
}
public class Test1 {
    public static void main(String[] args) {
        MyInterface myInterface = () -> {
            System.out.println("Hi Lambda Expression");
        };
        myInterface.sayHi();
    }
}
