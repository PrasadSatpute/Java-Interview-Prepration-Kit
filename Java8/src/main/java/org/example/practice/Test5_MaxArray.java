package org.example.practice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Write a method to find the maximum element in a list using streams.
public class Test5_MaxArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3254,65243452,4,3642,4,3,5434,2342,563,4524,35634);
        list.stream().max((a,b) -> a-b).stream().collect(Collectors.toList()).forEach(System.out::println);
    }
}
