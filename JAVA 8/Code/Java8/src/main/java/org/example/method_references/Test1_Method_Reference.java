package org.example.method_references;
import java.util.Arrays;
import java.util.List;
public class Test1_Method_Reference {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice","Bob","Charlie");
        students.forEach(Test1_Method_Reference::print);
    }
    public static void print(String s) {
        System.out.println(s);
    }
}
