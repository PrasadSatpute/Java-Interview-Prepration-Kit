package org.example.practice;

//Implement a functional interface to calculate the sum of two numbers.
public class Test2_Sum_FunctionalInterface {
    interface Sum
    {
        void add(int a,int b);
    }
    public static void main(String[] args) {
        Sum sum = (a,b) -> System.out.println(a+b);
        sum.add(1,2);
    }
}
