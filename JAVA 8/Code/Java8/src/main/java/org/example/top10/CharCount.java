package org.example.top10;

import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCount {
    public static void main(String[] args) {
        String input = "Java Programming";
        long count = input.chars().filter(ch -> ch == 'a').count();
        input.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Count of 'a': " + count);
    }
}
