package org.example.interview;
import java.util.Arrays;
import java.util.List;
public class P11_EvenMultiply2 {
    public static void main(String[] args) {
        System.out.println("Write a program to find even numbers from a list of integers and multiply with 2 using stream java 8.");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(x -> x % 2 ==0).map(x -> x * 2).forEach(System.out::println);
    }
}
