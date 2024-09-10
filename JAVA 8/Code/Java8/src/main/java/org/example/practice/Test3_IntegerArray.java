package org.example.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test3_IntegerArray {
    public static void main(String[] args) {
        int[] numbers = {5,6,4,21,1,5,7,9,11,15,3,6,7};
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Sorted Array List");
        List<Integer> collect = Arrays.stream(numbers).boxed().sorted().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Min of Array List");
        Arrays.stream(numbers).boxed().sorted().limit(1).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Second Min of Array List");
        Arrays.stream(numbers).boxed().sorted().skip(1).limit(1).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Max of Array List");
        Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Second Max of Array List");
        Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Count of all Integer in Array");
        Map<Integer, Long> collect1 = Arrays.stream(numbers).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Count of Repeated all Integer in Array");
        Arrays
                .stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Count of Unique Integer in Array");
        Arrays
                .stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Addition of All Integer in Array");
        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("start with 1 of All Integer in Array List");
        List<Integer> collect2 = Arrays.stream(numbers).boxed().filter(x -> x / 10 == 1 || x == 1).collect(Collectors.toList());
        System.out.println(collect2);
        List<String> collect3 = Arrays.stream(numbers).boxed().map(x -> x + "").filter(x -> x.startsWith("1")).collect(Collectors.toList());
        System.out.println(collect3);
        List<String> collect4 = Arrays.stream(numbers).boxed().map(Object::toString).filter(x -> x.startsWith("1")).collect(Collectors.toList());
        System.out.println(collect4);
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]/10);
//        }
    }
}
