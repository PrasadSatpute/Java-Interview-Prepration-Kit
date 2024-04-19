package org.example.practice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Convert a list of strings to uppercase using streams and method references.
public class Test4_Array_String_Uppercase {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Abcd","Hjh","anbt","dhv","aa","A");
        name.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
    }
}
