package org.example.interview2;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class P3_Frequency_String {
    public static void main(String[] args) {
        System.out.println("How do you find frequency of each character in a string using Java 8 streams?");
        String inputString = "Java Concept Of The Day";
        Map<Character, Long> collect = inputString
                .chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
