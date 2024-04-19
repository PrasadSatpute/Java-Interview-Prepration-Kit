package org.example.interview;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class P1_DuplicateArray {
    public static void main(String[] args) {
        System.out.println("Write a Program to find the duplicates in an array using stream API.");

        int[] array = {1234,1234,134,1234,3,412,34,245,356,46,34,52,35,3576,3,23,534,5};

        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        list.stream()
                .filter(i -> Collections.frequency(list, i) > 1)
                .distinct()
                .forEach(System.out::println);
    }
}
