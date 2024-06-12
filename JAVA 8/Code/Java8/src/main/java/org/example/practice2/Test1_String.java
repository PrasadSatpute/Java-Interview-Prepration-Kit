package org.example.practice2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1_String {
    public static void main(String[] args) {
        String str = "I am Java Developer with 2 years Experience.";
        System.out.println(str);

        System.out.println("---------------------------------------------");
        System.out.println("Convert it into Integer_ArrayList");
        String[] arrayStr = str.split(" ");
        System.out.println(Arrays.toString(arrayStr));
        List<String> strList = Arrays.stream(arrayStr).collect(Collectors.toList());
        System.out.println("Integer_ArrayList = "+strList);

        System.out.println("---------------------------------------------");
        System.out.println("Count All Words");
        str.chars().mapToObj(ch -> (char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().forEach(System.out::println);
        
    }
}
