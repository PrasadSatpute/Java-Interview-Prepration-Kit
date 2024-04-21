package org.example;
class MyClass
{
    static int i = 10;
    public MyClass()
    {
        System.out.println(i = i + 10);
    }
}
class MyClassStaticMethod
{
    static int i = 10;
//    int i = 10;
    public static void myStaticMethod()
    {
        System.out.println(i = i + 10);
    }
}

class OuterClass {
    static class StaticNestedClass {
        // static nested class
    }
}
public class StaticKeyword {
    static {
        System.out.println("Static Block is called");
    }
    public static void main(StringClass[] args) {
        System.out.println("Main method is called");
    }
}

