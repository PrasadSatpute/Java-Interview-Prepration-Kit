package org.example.lambda;

interface AnonymousInnerClass
{
    public void sayHi();
    public void sayBy();
}

@FunctionalInterface
interface MyInterface
{
    public void sayHi();
}
// Anonymous Inner Class and Lambda Expression

public class Test1 {
    public static void main(String[] args) {
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass() {
            @Override
            public void sayHi() {
                System.out.println("AnonymousInnerClass Hi");
            }

            @Override
            public void sayBy() {
                System.out.println("AnonymousInnerClass Bye");
            }
        };
        anonymousInnerClass.sayHi();
        anonymousInnerClass.sayBy();

        MyInterface myInterface = () -> {
            System.out.println("Lambda Expression Hi");
        };
        myInterface.sayHi();
    }
}
