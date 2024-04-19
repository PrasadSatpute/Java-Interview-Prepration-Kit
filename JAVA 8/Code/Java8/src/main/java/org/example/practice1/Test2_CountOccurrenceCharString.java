package org.example.practice1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2_CountOccurrenceCharString {
    public static void main(String[] args) {
        String s = "aaabbbcccdefghhikkkkklllag";
        System.out.println("Convert to Array of String");
        String[] split = s.split("");
        System.out.println(Arrays.toString(split));
        Map<Character, Long> collect = s.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("All Counts of each Char in String");
        System.out.println(collect);    //{a=4, b=3, c=3, d=1, e=1, f=1, g=2, h=2, i=1, k=5, l=3}
        List<Character> collect2 = collect.entrySet().stream().map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect2);   //[a, b, c, d, e, f, g, h, i, k, l]
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Duplicate Char in String");
        List<Map.Entry<Character, Long>> collect1 = s
                .chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .collect(Collectors.toList());
        System.out.println(collect1);   //[a=4, b=3, c=3, g=2, h=2, k=5, l=3]
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Only Unique element Char in String");
        s
                .chars()
                .mapToObj(ch -> (char)ch)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .forEach(System.out::println);
                                                /*  d
                                                    e
                                                    f
                                                    i   */
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Only First Unique element Char in String");
        s
                .chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .limit(1)
                .forEach(System.out::println);  // d
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Only Second Unique element Char in String");
        s
                .chars()
                .mapToObj(ch -> (char)ch)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .skip(1)
                .limit(1)
                .collect(Collectors.toList())
                .forEach(System.out::println);  // e
    }
}
