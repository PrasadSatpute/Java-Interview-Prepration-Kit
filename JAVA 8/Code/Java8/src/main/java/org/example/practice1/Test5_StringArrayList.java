package org.example.practice1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test5_StringArrayList {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Sorted String List in Descending");
        listOfStrings.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Sorted String List in Ascending");
        listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Max String in List");
        System.out.println("Using Reduce Method = "+listOfStrings.stream().reduce((str1,str2) -> str1.length() > str2.length() ? str1:str2).get());
        listOfStrings.stream().sorted(Comparator.comparing(String::length).reversed()).limit(1).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Min String in List");
        listOfStrings.stream().sorted(Comparator.comparing(String::length)).limit(1).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Count of String in List");
        listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);
    }
}
