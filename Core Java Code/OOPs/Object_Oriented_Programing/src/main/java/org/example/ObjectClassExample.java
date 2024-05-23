package org.example;

class A
{
    public void test()
    {
        System.out.println("Class A");
    }
}
class B extends A
{
    @Override
    public void test()
    {
        System.out.println("Class B");
    }
}
public class ObjectClassExample {
    public static void main(String[] args) {
        Object A = new B();
        System.out.println(A.getClass());
    }
}
