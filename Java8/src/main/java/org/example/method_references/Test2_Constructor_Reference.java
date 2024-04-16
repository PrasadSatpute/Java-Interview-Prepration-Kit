package org.example.method_references;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Test2_Constructor_Reference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        List<Student> students = names.stream().map(x -> new Student(x)).collect (Collectors.toList());
    }
}
