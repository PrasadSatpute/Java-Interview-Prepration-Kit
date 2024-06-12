package org.example.practice3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class String_ArrayList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","CoreJava","Spring","SpringBoot","Microservices","Spring","Java");



//        Longest string
        String s = list.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(s); // Microservices

//        String Join
        String join = String.join("-", list);
        System.out.println(join); // Java-CoreJava-Spring-SpringBoot-Microservices

//        String length count
        Map<String, Integer> collect = list.stream().collect(Collectors.toMap(Function.identity(), String::length, (existing, replacement) -> existing));
        System.out.println(collect);

    }
}
