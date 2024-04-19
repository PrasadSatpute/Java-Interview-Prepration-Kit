package org.example.practice;
import java.util.function.Function;
//Write a lambda expression to find the square of a given number.
public class Test1_Lambda_Square {
    public static void main(String[] args) {
        Function<Integer,Integer> function = x -> x * x;
        System.out.println(function.apply(2));
    }
}
