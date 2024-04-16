package org.example.interview2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class P21_Duplicate_Array {
    public static void main(String[] args) {
        System.out.println("How do you extract duplicate elements from an array?");
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> uniqueElements = new HashSet<>();
        listOfIntegers
                .stream()
                .filter(i -> !uniqueElements.add(i))
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
