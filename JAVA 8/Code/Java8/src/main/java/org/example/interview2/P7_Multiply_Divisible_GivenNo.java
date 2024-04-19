package org.example.interview2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class P7_Multiply_Divisible_GivenNo {
    public static void main(String[] args) {
        System.out.println("From the given list of integers, print the numbers which are multiples of 5?");
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers
                .stream()
                .filter(x -> x % 5 == 0)
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
