package org.example;

import java.util.Scanner;

@FunctionalInterface
interface samanLekeAna
{
    public void lekeAya();

    default void myMethod() {
        System.out.println("Default Method");
    }
    static void myStaticMethod()
    {
        System.out.println("Static Method");
    }
}
class Tomato implements samanLekeAna
{
    @Override
    public void lekeAya() {
        System.out.println("Mera Babu Tomato Leke Aya");
    }

    @Override
    public void myMethod() {
        samanLekeAna.super.myMethod();
    }
}
class Milk implements samanLekeAna
{
    @Override
    public void lekeAya() {
        System.out.println("Mera Babu Milk Leke Aya");
    }
    static void myStaticMethod()
    {
        System.out.println("Milk Static Method");
    }
}

class Parent
{

    public Parent myName()
    {
        return new Parent();
    }
    public void myName(int a)
    {

    }
    public int myName(double a)
    {
        return 0;
    }
}
class chiled extends Parent
{
    @Override
    public chiled myName() {
        super.myName();
        return new chiled();
    }

    public void myNameChilde(int a) {
        super.myName(a);
    }

    @Override
    public int myName(double a) {
        return super.myName(a);
    }
}

abstract class myAbstractClass
{
    public myAbstractClass()
    {
        System.out.println("Constructor of Abstract Class");
    }
    public void myMethod(){
        System.out.println("");
    }
    abstract public void oneMethod();
}


public class Main {
    public static void main(StringClass[] args) {
        ConstructorClass constructorClass = new ConstructorClass();
        Scanner sc = new Scanner(System.in);
        boolean hamaliKarvana = true;
        samanLekeAna samanLekeAna = null;
        while (hamaliKarvana)
        {
            System.out.println("Konsa Hamali Kam Batana Hai Bolo : Milk or Tomato (Daya aye to NO bole)");
            String bataoHamliKam = sc.nextLine();
            if (bataoHamliKam.equalsIgnoreCase("Milk"))
            {
                samanLekeAna = new Milk();
                Milk.myStaticMethod();
            }
            else if (bataoHamliKam.equalsIgnoreCase("Tomato")){
                samanLekeAna = new Tomato();
            }else {
                break;
            }
            samanLekeAna.lekeAya();
        }
        System.out.println("Thank You apne Daya dikhayi !");
    }
}