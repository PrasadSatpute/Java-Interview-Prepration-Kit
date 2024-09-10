package org.example.interview;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class P13_SetAccording_Length {
    public static void main(String[] args) {
        System.out.println("Given a list of strings, sort them according to increasing order of their length?");
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        listOfStrings.stream().sorted((a,b) -> b.length()-a.length()).forEach(System.out::println);
    }
}
