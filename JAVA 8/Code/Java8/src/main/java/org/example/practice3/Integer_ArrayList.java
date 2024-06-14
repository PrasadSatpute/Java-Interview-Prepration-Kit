package org.example.practice3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Integer_ArrayList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,7,5,8,10,12,7,5,3,2,12,8,9,4);

//        Convert into String List
        System.out.println(list.stream().map(String::valueOf).collect(Collectors.toList()));

//        List of Prime (2,3,5,7,11,13,17,19)
        list.stream()
                .filter(Integer_ArrayList::isPrime)
                .collect(Collectors.toList())
                .forEach(System.out::println);


//        List odd (1, 3, 5, 7, 9, 11, 13, 15, 17, 19)
        list.stream()
                .filter(x -> x%2 != 0)
                .collect(Collectors.toList())
                .forEach(System.out::println);


//        List Even (2,4,6,8,10,12,14,16,18,20)
        list.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toList())
                .forEach(System.out::println);

//        Addition or sum of even number
        System.out.println(list.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum());

//        Max and Min
        System.out.println("Min - " + list.stream().sorted().findFirst().get());
        System.out.println("Max - " + list.stream().sorted((a, b) -> b - a).findFirst().get());
        System.out.println("Max - " + list.stream().max(Comparator.naturalOrder()).get());

//        Sorted
        list.stream()
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .forEach(System.out::println);

//        Unique Elements
        list.stream()
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);

//        Occurrence and Frequency
        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

//        Duplicate means more than one
        list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .forEach(System.out::println);

//        First Non Repeat Element
        Integer firstKey = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .findFirst()
                .get().getKey();
        System.out.println(firstKey);

//        Second-Highest Element
        Integer secondHighest = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighest);

//        Start with 1
        List<Integer> collect1 = list.stream()
                .filter(x -> x / 10 == 1 || x == 1)
                .collect(Collectors.toList());
        System.out.println(collect1);

    }
    // Method to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
