package org.example.interview;
import java.util.stream.IntStream;
public class P17_EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Print first 10 even numbers");
        IntStream.range(1,11).filter(x -> x % 2 == 0).forEach(System.out::println);
        System.out.println("----------------------------------------------------");
        IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);
    }
}
