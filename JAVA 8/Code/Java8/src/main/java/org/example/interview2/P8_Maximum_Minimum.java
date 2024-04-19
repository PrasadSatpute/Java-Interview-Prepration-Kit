package org.example.interview2;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class P8_Maximum_Minimum {
    public static void main(String[] args) {
        System.out.println("Given a list of integers, find maximum and minimum of those numbers?");
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        listOfIntegers.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
        listOfIntegers.stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);

        System.out.println("\nWe want 3 MAX and 3 MIN");
        System.out.println("MAX = ");

        listOfIntegers.stream().sorted((a,b) -> b-a).limit(3).forEach(System.out::println);

        System.out.println("Using Comparator.reverseOrder()");

        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

        System.out.println("\nMIN = ");

        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);
    }
}
