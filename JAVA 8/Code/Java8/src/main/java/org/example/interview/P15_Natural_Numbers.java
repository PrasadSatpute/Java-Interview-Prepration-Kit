package org.example.interview;
import java.util.stream.IntStream;
public class P15_Natural_Numbers {
    public static void main(String[] args) {
        System.out.println("How do you find sum of first 10 natural numbers?");
        System.out.println(IntStream.range(1,11).sum());
    }
}
