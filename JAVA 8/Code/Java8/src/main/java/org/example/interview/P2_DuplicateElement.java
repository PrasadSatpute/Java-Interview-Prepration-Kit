package org.example.interview;
import java.util.Arrays;
import java.util.List;
public class P2_DuplicateElement {
    public static void main(String[] args) {
        System.out.println("How do you remove duplicate elements from a list using Java 8 streams?");
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        listOfStrings.stream().distinct().forEach(System.out::println);
    }
}
