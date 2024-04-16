package org.example.interview2;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class P0_String_Integer {
    public static void main(String[] args) {
        String name = "Prasad";

        System.out.println("In char Array");
        char[] charName = name.toCharArray();
        System.out.println(charName);

        System.out.println("Print each char in Next line");
        name
                .chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Print each char in UpperCase");
        name.toUpperCase()
                .chars()
                .mapToObj(ch -> (char)ch);

        System.out.println("Print each char in Revers Order");
        name
                .chars()
                .mapToObj(ch -> (char)ch)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);

        System.out.println("Print Frequency of Each Char in String");
        Map<Character, Long> collect = name
                .chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }
}
