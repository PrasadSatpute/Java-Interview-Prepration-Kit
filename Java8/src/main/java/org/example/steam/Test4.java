package org.example.steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        Integer i = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .filter(x -> x % 2 == 0)
                .map(x -> x / 20)
                .distinct()
                .peek(System.out::println)
                .max((a, b) -> b - a)
                .get();
        System.out.println(i);
    }
}
