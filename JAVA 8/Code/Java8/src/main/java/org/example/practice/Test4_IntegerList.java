package org.example.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test4_IntegerList {
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(5, 6, 4, 21, 1, 5, 7, 9, 11, 15, 3, 6, 7);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Sorted Array List");
        List<Integer> sorted = listNumbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Min of Array List");
        Integer min1 = Collections.min(listNumbers);
        System.out.println("Min1 = "+min1);
        Integer min2 = listNumbers.stream().sorted().findFirst().get();
        System.out.println("Mi2 = "+min2);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Second Min of Array List");
        Integer secondMin = listNumbers.stream().sorted().skip(1).findFirst().get();
        System.out.println(secondMin);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Max of Array List");
        Integer max1 = Collections.max(listNumbers);
        System.out.println("Max1 = "+max1);
        Integer max2 = listNumbers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println("Max2 = "+max2);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Second Max of Array List");
        Integer secondMax = listNumbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondMax);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Count of all Integer in Array");
        listNumbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Count of Repeated all Integer in Array");
        listNumbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Count of Unique Integer in Array");
        listNumbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Addition of All Integer in Array");
        int total = 0;
        for (Integer num: listNumbers)
        {
            total = total + num;
        }
        System.out.println(total);
        int sum = listNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
