package org.example;

/**
 * Hello world!
 *
 */

@FunctionalInterface
interface myInterface {
    public void getID();
    default void printDefault()
    {
        System.out.println("Default Method in Child Class");
    }
    static void printStatic()
    {
        System.out.println("Static method in Parent Class which cant Override it in Child Class");
    }
}

@FunctionalInterface
interface myChildInterface extends myInterface{
    public void getID();
    @Override
    default void printDefault()
    {
        System.out.println("Default Method in Child Class");
    }
//    @Override             // we cant Override static method in Child Class
    static void printStatic()
    {
        System.out.println("Static method in Parent Class");
    }
}
class myNormalClass
{
    static void printAny()
    {
        System.out.println("Hi from Normal Class and Not Override in any class");
    }
}
class myNormalChildClass extends myNormalClass implements myInterface
{
    @Override
    public void getID() {
        System.out.println();
    }
}
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        myChildInterface myChildInterface = () -> {
            System.out.println("Hi Java 8 from Parent Class");
        };
        myChildInterface.getID();

        myInterface.printStatic();
        myChildInterface anInterface = () -> {
            System.out.println("Hi Java 8 from Child Class");
        };
        anInterface.getID();
        anInterface.printDefault();

        myNormalClass.printAny();       // we can call static method from using class name
        myNormalChildClass.printAny();
    }
}
