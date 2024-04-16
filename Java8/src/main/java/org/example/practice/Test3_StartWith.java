package org.example.practice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Use the Stream API to filter a list of strings starting with the letter "A".
public class Test3_StartWith {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Abcd","Hjh","anbt","dhv","aa","A");
        System.out.println(name.stream().filter(s -> s.toLowerCase().startsWith("a")).collect(Collectors.toList()));
    }
}
